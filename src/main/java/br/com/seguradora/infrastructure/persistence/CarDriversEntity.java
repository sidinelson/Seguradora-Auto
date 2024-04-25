package br.com.seguradora.infrastructure.persistence;

import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "CAR_DRIVERS")
public class CarDriversEntity {

    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "DRIVER_ID")
    private DriversEntity driversEntity;

    @ManyToOne
    @JoinColumn(name = "CAR_ID")
    private CarsEntity carsEntity;

    @Column(name = "IS_MAIN_DRIVER")
    @Enumerated(EnumType.STRING)
    private InsurancesTypeEnum isMainDriver;

}
