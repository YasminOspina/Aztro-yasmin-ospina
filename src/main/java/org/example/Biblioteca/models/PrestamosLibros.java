package org.example.Biblioteca.models;

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

public class PrestamosLibros {
    @Id
    private int id_libro;
    private int id_usuario;
    private String fecha_prestamo;
    private String fecha_devolucion;

}
