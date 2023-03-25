
package com.Pro_Clinica_Veterinaria.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/principal")
public class PrincipalController {
    
    @GetMapping("/ingresar")
    public String MenuPrincipal() {
        return "principal";
    }
    
}
