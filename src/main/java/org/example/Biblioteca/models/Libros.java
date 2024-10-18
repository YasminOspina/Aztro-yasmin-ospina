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

public class Libros {
    @Id
    private int id_Libro;
    private String nombre;
    private String autor_id;

}
