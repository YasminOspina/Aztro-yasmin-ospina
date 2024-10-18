package org.example.Supermercado.models;

import jakarta.persistence.Column;
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

public class Marcas {
    @Id
    private int id_marca;
    @Column(nullable = false)
    private String nombre;
    private String Pais;
    private String descripcion;

}