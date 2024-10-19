package org.example.Universidad.repositories;

import org.example.Universidad.configs.EntityManagerPostgres;
import org.example.Universidad.models.Estudiantes;


public class EstudiantesRepository extends AbstractRepository<Estudiantes> {
    public  EstudiantesRepository() {super(new EntityManagerPostgres());
    }
}