package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.UsuarioRol;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsuarioRolMapper {
    @Select("SELECT * FROM UsuarioRol")
    List<UsuarioRol> findAll();
}
