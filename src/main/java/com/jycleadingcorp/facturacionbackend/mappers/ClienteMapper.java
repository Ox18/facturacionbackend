package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.Cliente;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClienteMapper {

    @Select("select * from Cliente")
    List<Cliente> findAll();
}
