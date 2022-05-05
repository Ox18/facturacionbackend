package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.UsuarioMapper;
import com.jycleadingcorp.facturacionbackend.models.Usuario;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin
public class UsuarioController {

    private UsuarioMapper usuarioMapper;

    public UsuarioController(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }

    @GetMapping("")
    public List<Usuario> getAll(
            @RequestParam Map<String, String> allParams
    ){
        return usuarioMapper.findAll();
    }

    @GetMapping("/check")
    public Boolean checkUsername(
            @RequestParam Map<String, String> allParams
    ){
        if(allParams.containsKey("username")){
            List<Usuario> usuarios = usuarioMapper.existUsername(allParams.get("username"));
            return usuarios.size() > 0;
        }else{
            throw new Error("Not valid query");
        }
    }

    @PostMapping(
            consumes = (MediaType.APPLICATION_JSON_VALUE)
    )
    public void CrearUsuarioConRol(
            @RequestBody Map<String, String> body
    ){
        int idRol = Integer.parseInt(body.get("idRol"));
        int estado = Integer.parseInt(body.get("estado"));
        String username = body.get("username");
        String password = body.get("password");
        String nombres = body.get("nombres");
        String apellidos = body.get("apellidos");
        usuarioMapper.crearUsuarioConRol(idRol, estado, username, password, nombres, apellidos);
    }
}
