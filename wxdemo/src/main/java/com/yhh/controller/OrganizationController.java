package com.yhh.controller;

import com.yhh.mapper.OrganizationMapper;
import com.yhh.pojo.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {
    @Autowired
    OrganizationMapper organizationMapper;


    @RequestMapping("/showAllOrganization")
    List<Organization> showAllOrganization(){
        return organizationMapper.showAllOrganization();
    }

    @RequestMapping("/showOrganization/{id}")
    Organization showOrganization(@PathVariable("id")int id){
        return organizationMapper.selectOrganizationById(id);
    }

    @RequestMapping("/insertOrganization")
    Organization insertOrganization(Organization organization){
        organizationMapper.insertOrganization(organization);
        return organization;
    }

    @RequestMapping("/updateOrganization/{id}")
    Organization updateOrganization(@PathVariable("id")int id,Organization organization){
        organizationMapper.updateOrganization(organization);
        return organizationMapper.selectOrganizationById(id);
    }

    @RequestMapping("/deleteOrganization/{id}")
    String deleteOrganization(@PathVariable("id") int id){
        if(organizationMapper.selectOrganizationById(id)==null){
            return "not found";
        }
        organizationMapper.deleteOrganization(id);
        return "success";
    }
}

