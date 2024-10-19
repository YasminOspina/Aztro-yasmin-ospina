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


public class Cursos {
    @Id
    private int id_curso;
    private String nombre;
    private int creditos;
    private int horas;
}