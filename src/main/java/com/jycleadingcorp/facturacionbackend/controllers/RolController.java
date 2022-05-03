package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.RolMapper;
import com.jycleadingcorp.facturacionbackend.models.Rol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    private RolMapper rolMapper;


    public RolController(RolMapper rolMapper) {
        this.rolMapper = rolMapper;
    }

    @GetMapping("")
    public List<Rol> getAll(){
        return rolMapper.findAll();
    }
}
