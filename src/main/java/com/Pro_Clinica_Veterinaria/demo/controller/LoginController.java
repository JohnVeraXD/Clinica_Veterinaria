package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Usuario;
import com.Pro_Clinica_Veterinaria.demo.repository.UserRepository;
import java.util.Optional;
import javax.naming.AuthenticationException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String mostrarLogin() {
        return "index";
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam(value = "nombreUsuario") String nombreUsuario, @RequestParam(value = "contrasenia") String contrasenia, Model model,HttpSession sesion) {

        Usuario user = userRepository.findByNombreUsuarioAndContrasenia(nombreUsuario, contrasenia);
        if (user != null) {
            sesion.setAttribute("user", nombreUsuario);
            
            if(user.getRole().equals("admin")){
                return "VerCita";
            } else if (user.getRole().equals("recepcionista")) {
                return "principal";
            } else if (user.getRole().equals("veterinario")) {
                return "principal";
            } else {
                return "principal";
            }
        } else {
            return "index";
        }
    }

    

   /*
    @PostMapping("/Iniciar")
    public String procesarFormulario(@RequestParam String nombreUsuario,
                                     @RequestParam String contrasenia,
                                     HttpSession sesion) {
        Usuario user = userRepository.findByNombreUsuarioAndContrasenia(nombreUsuario, contrasenia);
        if (user != null && user.getContrasenia().equals(contrasenia)) {
            sesion.setAttribute("usuario", user);
            if (user.getRole().equals("admin")) {
                return "principal";
            } else if (user.getRole().equals("recepcionista")) {
                return "principal";
            } else if (user.getRole().equals("veterinario")) {
                return "principal";
            }
        }
        return "redirect:/Login?error";
    }
     */

}