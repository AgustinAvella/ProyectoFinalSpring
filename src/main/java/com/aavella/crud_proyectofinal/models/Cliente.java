package com.aavella.crud_proyectofinal.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
@Entity
@Table(name="Clientes")
public class Cliente {
    @Getter
    @Setter
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Integer id;
    @Getter
    @Setter
    private String Nombre;
    @Getter
    @Setter
    private String Apellido;
    @Getter
    @Setter
    @Temporal(TemporalType.DATE)
    @CreatedDate
    @Column(name = "Fecha_Nacimiento")
    private Date Fecha_Nacimiento;

    @Override
    public String toString() {
        return  "ID =" + id +
                " | Nombre ='" + Nombre + '\'' +
                " | Apellido =" + Apellido +
                " | Fecha_Nacimiento =" + Fecha_Nacimiento +
                '}';
    }
}
