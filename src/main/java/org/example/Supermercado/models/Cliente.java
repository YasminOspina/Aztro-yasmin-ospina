package org.example.Supermercado.models;

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


public class Cliente {
    @Id
    @Column(nullable = false)
    private Long cedula;
    @Column(nullable = false)
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefonoFijo;
    private String Celular;
    /*
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Compras> compras;
     */
}

