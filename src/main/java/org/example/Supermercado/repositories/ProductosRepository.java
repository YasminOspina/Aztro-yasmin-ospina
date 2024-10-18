package org.example.Supermercado.repositories;

import org.example.Supermercado.configs.EntityManagerPostgres;
import org.example.Supermercado.models.Productos;
import org.example.Supermercado.repositories.AbstractRepository;



public class ProductosRepository extends AbstractRepository<Productos> {
    public ProductosRepository() {super(new EntityManagerPostgres<>());
    }
}