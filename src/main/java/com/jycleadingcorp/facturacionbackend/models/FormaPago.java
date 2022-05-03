package com.jycleadingcorp.facturacionbackend.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FormaPago {
    private int id;
    private String Descripcion;
    private int UsuarioCreacion;
    private Date FechaCreacion;
}
