package org.example.Universidad.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Id;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Estudiantes {
    @Id
    @Column(nullable = false)
    private Long id_estudiante;
    @Column(nullable = false)
    private Long cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefonoFijo;
    private String Celular;
}