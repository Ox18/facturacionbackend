package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.Usuario;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import java.util.List;

@Mapper
public interface UsuarioMapper {
    @Select("SELECT * FROM Usuario")
    List<Usuario> findAll();

    @Select("SELECT * from Usuario WHERE username = #{username}")
    List<Usuario>existUsername(String username);

    @Select("CALL SP_CrearUsuarioConRol(#{idRol},#{estado},#{username},#{password},#{nombres},#{apellidos})")
    void crearUsuarioConRol(
            int idRol,
            int estado,
            String username,
            String password,
            String nombres,
            String apellidos
    );
}