package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.Usuario;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsuarioMapper {
    @Select("SELECT * FROM Usuario")
    List<Usuario> findAll();
}
