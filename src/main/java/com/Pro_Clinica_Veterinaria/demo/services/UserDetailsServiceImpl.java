package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Usuario;
import com.Pro_Clinica_Veterinaria.demo.repository.UserRepository;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = userRepository.findByNombreUsuario(nombreUsuario)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + nombreUsuario));

        return new org.springframework.security.core.userdetails.User(usuario.getNombreUsuario(), usuario.getContrasenia(),
                Collections.singleton(new SimpleGrantedAuthority(usuario.getRole())));
    }
}
