package org.example.Biblioteca.repositories;

import org.example.Biblioteca.configs.EntityManagerPostgres;
import org.example.Biblioteca.models.Autores;
import org.example.Biblioteca.repositories.AbstractRepository;

public class AutoresRepository extends AbstractRepository<Autores> {
    public AutoresRepository() {super(new EntityManagerPostgres());
    }
}