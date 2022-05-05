package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.UsuarioRolMapper;
import com.jycleadingcorp.facturacionbackend.models.UsuarioRol;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuariorol")
@CrossOrigin
public class UsuarioRolController {

    private UsuarioRolMapper usuarioRolMapper;


    public UsuarioRolController(UsuarioRolMapper usuarioRolMapper) {
        this.usuarioRolMapper = usuarioRolMapper;
    }

    @GetMapping("")
    public List<UsuarioRol> getAll(
        @RequestParam Map<String, String> allParams
    ){
        //System.out.println(allParams);
        if(allParams.containsKey("related")){
            String[] related = allParams.get("related").split(",");
            for(int i = 0; i < related.length; i++){
                System.out.println(related[i]);
            }
        }
        return usuarioRolMapper.findAll();
    }
}
