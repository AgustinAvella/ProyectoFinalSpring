package com.aavella.crud_proyectofinal.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name="productos")
public class Producto {
    @Getter
    @Setter
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Integer ID;
    @Getter
    @Setter
    private String Nombre;
    @Getter
    @Setter
    private Double Precio;
    @Getter
    @Setter
    @Temporal(TemporalType.DATE)
    @CreatedDate
    @Column(name = "Fecha_Alta")
    private Date Fecha_Alta;

    @Override
    public String toString() {
        return  "ID =" + ID +
                " | Nombre ='" + Nombre + '\'' +
                " | Precio =" + Precio +
                " | Fecha_Alta =" + Fecha_Alta +
                '}';
    }
}

