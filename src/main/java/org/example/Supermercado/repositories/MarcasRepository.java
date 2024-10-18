package org.example.Supermercado.repositories;

import org.example.Supermercado.configs.EntityManagerPostgres;
import org.example.Supermercado.models.Marcas;
import org.example.Supermercado.repositories.AbstractRepository;

public class MarcasRepository extends AbstractRepository<Marcas> {
    public MarcasRepository() {super(new EntityManagerPostgres<>());
    }
}
