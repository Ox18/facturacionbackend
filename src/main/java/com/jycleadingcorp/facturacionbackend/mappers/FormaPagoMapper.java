package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.FormaPago;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FormaPagoMapper {

    @Select("SELECT * FROM FormaPagoMapper")
    List<FormaPago> findAll();
}
