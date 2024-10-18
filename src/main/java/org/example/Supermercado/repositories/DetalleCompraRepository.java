package org.example.Supermercado.repositories;

import org.example.Supermercado.configs.EntityManagerPostgres;
import org.example.Supermercado.models.DetalleCompra;
import org.example.Supermercado.repositories.AbstractRepository;

public class DetalleCompraRepository extends AbstractRepository<DetalleCompra> {
    public DetalleCompraRepository() {super(new EntityManagerPostgres<>());
    }
}