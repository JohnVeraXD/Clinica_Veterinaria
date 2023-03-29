
package com.Pro_Clinica_Veterinaria.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/principal")
public class PrincipalController {
    
    @GetMapping("/MenuPrincipalAdmin")
    public String MenuPrincipal() {
        return "principal";
    }
    
}
