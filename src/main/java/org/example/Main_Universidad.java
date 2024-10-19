package org.example;
import org.example.Universidad.models.Estudiantes;
import org.example.Universidad.models.Cursos;
import org.example.Universidad.repositories.*;

import java.util.List;
import java.util.ArrayList;

public class Main_Universidad {
     public static void main(String[] args) {

         //Repositorios

         EstudiantesRepository estudiantesRepository = new EstudiantesRepository();

         CursosRepository cursosRepository = new CursosRepository();
         NotaCursoRepository notacursoRepository = new NotaCursoRepository();
         ProfesoresRepository profesoresRepository = new ProfesoresRepository();
         AsignacionRepository asignacionRepository = new AsignacionRepository();



         //Dominios (registros)

         Estudiantes estudiante1 = Estudiantes.builder()
                 .id_estudiante(1234567890L)
                 .cedula(1234567890L)
                 .nombre("Juan")
                 .apellido("Perez")
                 .direccion("Calle 123")
                 .telefonoFijo("1234567")
                 .Celular("0987654321")
                 .build();

         Estudiantes estudiante2 = Estudiantes.builder()
                 .id_estudiante(1234567891L)
                 .cedula(1234567891L)
                 .nombre("Maria")
                 .apellido("Gomez")
                 .direccion("Calle 456")
                 .telefonoFijo("1234568")
                 .Celular("0987654322")
                 .build();

         estudiantesRepository.create(estudiante1);
         estudiantesRepository.create(estudiante2);

         estudiantesRepository.findAll()
                 .stream()
                 .forEach(System.out::println);

         estudiantesRepository.close();
     }

 }