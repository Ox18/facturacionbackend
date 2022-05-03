package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.ComprobanteDetalleMapper;
import com.jycleadingcorp.facturacionbackend.models.ComprobanteDetalle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ComprobanteDetalle")
public class ComprobanteDetalleController {

    private ComprobanteDetalleMapper comprobanteDetalleMapper;

    public ComprobanteDetalleController(ComprobanteDetalleMapper comprobanteDetalleMapper) {
        this.comprobanteDetalleMapper = comprobanteDetalleMapper;
    }

    @GetMapping("")
    public List<ComprobanteDetalle> getAll(){
        return comprobanteDetalleMapper.findAll();
    }
}
