package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.ComprobanteDetalle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComprobanteDetalleMapper {

    @Select("SELECT * FROM ComprobanteDetalle")
    List<ComprobanteDetalle> findAll();
}
