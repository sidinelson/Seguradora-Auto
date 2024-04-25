package br.com.seguradora.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "CARS")
public class CarsEntity {

    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "MODEL", nullable = false)
    private String model;

    @Column(name = "MANUFACTURER")
    private String manufacture;

    @Column(name = "YEARS")
    private String years;

    @Column(name = "FIPE_VALUE")
    private BigDecimal fipeValeu;

}

