package org.example.Universidad.repositories;

import org.example.Universidad.configs.EntityManagerPostgres;
import org.example.Universidad.models.Profesores;

public class ProfesoresRepository extends AbstractRepository<Profesores> {
    public  ProfesoresRepository() {
        super(new EntityManagerPostgres());
    }
}