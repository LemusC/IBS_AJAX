package com.ibs.controller;

import java.util.List;

import com.ibs.model.Role;
import com.ibs.repository.IRolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RolController
 */
@Controller
@RequestMapping(value = "rol")
public class RolController {
    
    @Autowired
    IRolRepository rRol;

    @GetMapping(value = "list")
    public String index() {
        return new String("/vistas/Rol/ListarRol");
    }
    
    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Role> getAll() { 
        return (List<Role>) rRol.findAll();
    }
}