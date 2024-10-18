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

public class Autores {
    @Id
    private int id_autor;
    private String nombre;
    private String nacionalidad;
}
