package com.yhh.mapper;

import com.yhh.pojo.Organization;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrganizationMapper {
    @Select("select * from organization")
    List<Organization> showAllOrganization();

    @Select("select * from organization where id = #{id}")
    Organization selectOrganizationById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into organization (id,name,description,icon,hotnum) values(#{id},#{name},#{description},#{icon},#{hotnum})")
    int insertOrganization(Organization organization);

    @Update("update organization set name=#{name},description=#{description},icon=#{icon},hotnum=#{hotnum} where id=#{id}")
    int updateOrganization(Organization organization);

    @Delete("delete from organization where id=#{id}")
    int deleteOrganization(int id);
}

