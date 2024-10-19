package org.example.Universidad.repositories;

import org.example.Universidad.configs.EntityManagerPostgres;
import org.example.Universidad.models.NotaCurso;


public class NotaCursoRepository extends AbstractRepository<NotaCurso> {
    public NotaCursoRepository() {super(new EntityManagerPostgres());
    }
}