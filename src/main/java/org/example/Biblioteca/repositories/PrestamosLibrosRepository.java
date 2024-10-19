package org.example.Biblioteca.repositories;

import org.example.Biblioteca.configs.EntityManagerPostgres;
import org.example.Biblioteca.models.PrestamosLibros;
import org.example.Biblioteca.repositories.AbstractRepository;

public class PrestamosLibrosRepository extends AbstractRepository<PrestamosLibros> {
    public PrestamosLibrosRepository() {super(new EntityManagerPostgres());
    }
}