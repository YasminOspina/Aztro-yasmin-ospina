package org.example.Supermercado.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class DetalleCompra {
    @Id
    private int id_compra;
    private int id_producto;
    private int cantidad;
}