package com.jycleadingcorp.facturacionbackend.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ComprobanteDetalle {
    private int id;
    private int IdComprobante;
    private int IdProducto;
    private int Cantidad;
    private int Precio;
    private int Total;
    private int UsuarioCreacion;
    private Date FechaCreacion;
}
