package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.UsuarioMapper;
import com.jycleadingcorp.facturacionbackend.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private UsuarioMapper usuarioMapper;

    public UsuarioController(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }

    @GetMapping("")
    public List<Usuario> getAll(){
        return usuarioMapper.findAll();
    }
}
