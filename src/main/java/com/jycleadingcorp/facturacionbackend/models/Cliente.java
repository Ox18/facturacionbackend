package com.jycleadingcorp.facturacionbackend.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Cliente {
    private int id;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private int UsuarioCreacion;
    private Date FechaCreacion;
}
