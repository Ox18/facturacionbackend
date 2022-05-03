package com.jycleadingcorp.facturacionbackend.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Comprobante {
    private int id;
    private String Serie;
    private String Numero;
    private Date Fecha;
    private int IdCliente;
    private int FormaPagoId;
    private int UsuarioCreacion;
    private Date FechaCreacion;
}
