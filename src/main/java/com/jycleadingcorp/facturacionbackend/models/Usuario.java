package com.jycleadingcorp.facturacionbackend.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id;
    private int estado;
    private String username;
    private String password;
    private String nombres;
    private String apellidos;
}
