package org.example.Biblioteca.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Usuarios {
    @Id
    @Column(nullable = false)
    private Long Id;
    @Column(nullable = false)
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefonoFijo;
    private String Celular;
}