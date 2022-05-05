package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.ComprobanteMapper;
import com.jycleadingcorp.facturacionbackend.models.Comprobante;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
@CrossOrigin
public class ComprobanteController {

    private ComprobanteMapper comprobanteMapper;


    public ComprobanteController(ComprobanteMapper comprobanteMapper) {
        this.comprobanteMapper = comprobanteMapper;
    }

    @GetMapping("")
    public List<Comprobante> getAll() { return comprobanteMapper.findAll(); }
}
