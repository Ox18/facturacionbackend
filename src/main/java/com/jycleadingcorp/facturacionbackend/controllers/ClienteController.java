package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.ClienteMapper;
import com.jycleadingcorp.facturacionbackend.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private ClienteMapper clienteMapper;

    public ClienteController(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    @GetMapping("")
    public List<Cliente> getAll(){
        return clienteMapper.findAll();
    }
}
