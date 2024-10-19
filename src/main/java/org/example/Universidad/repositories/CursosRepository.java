package org.example.Universidad.repositories;

import org.example.Universidad.configs.EntityManagerPostgres;
import org.example.Universidad.models.Cursos;
import org.example.Universidad.repositories.AbstractRepository;


public class CursosRepository extends AbstractRepository<Cursos> {
    public  CursosRepository() {super(new EntityManagerPostgres());
    }
}