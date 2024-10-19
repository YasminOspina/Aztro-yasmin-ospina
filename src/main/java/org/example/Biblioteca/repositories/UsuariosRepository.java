package org.example.Biblioteca.repositories;

import org.example.Biblioteca.configs.EntityManagerPostgres;
import org.example.Biblioteca.models.Usuarios;


public class UsuariosRepository extends AbstractRepository<Usuarios> {
    public UsuariosRepository() {super(new EntityManagerPostgres());
    }
}

