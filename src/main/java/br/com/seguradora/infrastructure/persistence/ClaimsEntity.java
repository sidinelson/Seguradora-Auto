package br.com.seguradora.infrastructure.persistence;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "CLAIMS")
public class ClaimsEntity {

    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CAR_ID")
    private CarsEntity carsEntity;

    @ManyToOne
    @JoinColumn(name = "DRIVER_ID")
    private DriversEntity driversEntity;

    @Column(name = "EVENT_DATE")
    private LocalDate eventDate;


}
