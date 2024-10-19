package org.example;

import org.example.Biblioteca.models.Usuarios;
import org.example.Biblioteca.repositories.AutoresRepository;
import org.example.Biblioteca.repositories.LibrosRepository;
import org.example.Biblioteca.repositories.PrestamosLibrosRepository;
import org.example.Biblioteca.repositories.UsuariosRepository;

public class Main_Biblioteca {
    public static void main(String[] args) {

        //Repositorios

        AutoresRepository autoresRepository = new AutoresRepository();
        LibrosRepository librosRepository = new LibrosRepository();
        PrestamosLibrosRepository prestamosLibrosRepository = new PrestamosLibrosRepository();
        UsuariosRepository usuariosRepository = new UsuariosRepository();



        //Dominios (registros)

        Usuarios usuario1 = Usuarios.builder()
                .Id(1234567890L)
                .nombre("Juan")
                .apellido("Perez")
                .direccion("Calle 123")
                .telefonoFijo("1234567")
                .Celular("0987654321")
                .build();

        Usuarios usuario2 = Usuarios.builder()
                .Id(1234567891L)
                .nombre("Maria")
                .apellido("Gomez")
                .direccion("Calle 456")
                .telefonoFijo("1234568")
                .Celular("0987654322")
                .build();

        usuariosRepository.create(usuario1);
        usuariosRepository.create(usuario2);

        usuariosRepository.findAll()
                .stream()
                .forEach(System.out::println);

        usuariosRepository.close();
    }

}