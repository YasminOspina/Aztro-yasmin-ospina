package org.example.Supermercado.repositories;

import org.example.Supermercado.configs.EntityManagerPostgres;
import org.example.Supermercado.models.Compras;
import org.example.Supermercado.repositories.AbstractRepository;

public class ComprasRepository extends AbstractRepository<Compras> {
    public ComprasRepository() {super(new EntityManagerPostgres<>());
    }
}
