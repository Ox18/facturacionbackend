package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.UsuarioRolMapper;
import com.jycleadingcorp.facturacionbackend.models.UsuarioRol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuariorol")
public class UsuarioRolController {

    private UsuarioRolMapper usuarioRolMapper;


    public UsuarioRolController(UsuarioRolMapper usuarioRolMapper) {
        this.usuarioRolMapper = usuarioRolMapper;
    }

    @GetMapping("")
    public List<UsuarioRol> getAll(){
        return usuarioRolMapper.findAll();
    }
}
