package com.jycleadingcorp.facturacionbackend.controllers;

import com.jycleadingcorp.facturacionbackend.mappers.FormaPagoMapper;
import com.jycleadingcorp.facturacionbackend.models.FormaPago;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/formapago")
@CrossOrigin
public class FormaPagoController {

    private FormaPagoMapper formaPagoMapper;


    public FormaPagoController(FormaPagoMapper formaPagoMapper) {
        this.formaPagoMapper = formaPagoMapper;
    }

    @GetMapping("")
    public List<FormaPago> getAll(){
        return formaPagoMapper.findAll();
    }
}
