package org.example.Universidad.repositories;

import org.example.Universidad.configs.EntityManagerPostgres;
import org.example.Universidad.models.Asignacion;
import org.example.Universidad.repositories.AbstractRepository;


public class AsignacionRepository extends AbstractRepository<Asignacion> {
    public  AsignacionRepository() {super(new EntityManagerPostgres());
    }
}