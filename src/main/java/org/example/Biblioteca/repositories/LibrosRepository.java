package org.example.Biblioteca.repositories;

import org.example.Biblioteca.configs.EntityManagerPostgres;
import org.example.Biblioteca.models.Libros;
import org.example.Biblioteca.repositories.AbstractRepository;

public class LibrosRepository extends AbstractRepository<Libros> {
    public LibrosRepository() {super(new EntityManagerPostgres());
    }
}