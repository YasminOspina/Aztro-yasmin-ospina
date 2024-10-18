package org.example;

import org.example.Supermercado.models.Cliente;
import org.example.Supermercado.models.Productos;
import org.example.Supermercado.repositories.ClienteRepository;
import org.example.Supermercado.repositories.ProductosRepository;
import org.example.Supermercado.repositories.MarcasRepository;
import org.example.Supermercado.repositories.ComprasRepository;
import org.example.Supermercado.repositories.DetalleCompraRepository;

import java.util.List;
import java.util.ArrayList;

public class Main_Supermercado {
    public static void main(String[] args) {

        //Repositorios

        ClienteRepository clienteRepository = new ClienteRepository();
        ProductosRepository productosRepository = new ProductosRepository();
        MarcasRepository marcasRepository = new MarcasRepository();
        ComprasRepository comprasRepository = new ComprasRepository();
        DetalleCompraRepository detalleCompraRepository = new DetalleCompraRepository();


        //Dominios (registros)

        Cliente cliente1 = Cliente.builder()
                .cedula(1234567890L)
                .nombre("Juan")
                .apellido("Perez")
                .direccion("Calle 123")
                .telefonoFijo("1234567")
                .Celular("0987654321")
                .build();

        Cliente cliente2 = Cliente.builder()
                .cedula(1234567891L)
                .nombre("Maria")
                .apellido("Gomez")
                .direccion("Calle 456")
                .telefonoFijo("1234568")
                .Celular("0987654322")
                .build();

        clienteRepository.create(cliente1);
        clienteRepository.create(cliente2);

        clienteRepository.findAll()
                .stream()
                .forEach(System.out::println);
        
        clienteRepository.close();
    }
    }
}