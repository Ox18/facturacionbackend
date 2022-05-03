package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.Comprobante;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComprobanteMapper {

    @Select("SELECT * FROM Comprobante")
    List<Comprobante> findAll();
}
