package com.example.intelicurso.rest;

import com.example.intelicurso.models.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRest {

    @GetMapping("/")
    ResponseEntity<?> getUsuarios(){

        Usuario usuario1 =  new Usuario("Homer","Simpson", "homers@aol.com", "123456", "555-5555");
        Usuario usuario2 =  new Usuario("Marge","Simpson", "marge@aol.com", "123456", "555-5555");
        Usuario usuario3 =  new Usuario("Bart","Simpson", "bart@aol.com", "123456", "555-5555");
        Usuario usuario4 =  new Usuario("Lisa","Simpson", "lisa@aol.com", "chica_jazz", "555-5555");
        Usuario usuario5 =  new Usuario("Abe","Simpson", "oldcoot@aol.com", "yelling_at_cloud", "555-5555");

        //Crear un arreglo de usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);
        //Retornar el arreglo de usuarios
        return ResponseEntity.ok(usuarios);


    }

}
