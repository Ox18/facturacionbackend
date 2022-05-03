package com.jycleadingcorp.facturacionbackend.mappers;

import com.jycleadingcorp.facturacionbackend.models.Rol;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RolMapper {

    @Select("select * from Rol")
    List<Rol> findAll();
}
