package br.com.seguradora.infrastructure.persistence;

import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "INSURANCES")
public class InsurancesEntity {

    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private CustomerEntity customerEntity;

    @Column(name = "CREATION_DT")
    private LocalDateTime creationDt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updateDat;

    @ManyToOne
    @JoinColumn(name = "CAR_ID")
    private CarsEntity carsEntity;

    @Column(name = "IS_ACTIVE")
    @Enumerated(EnumType.STRING)
    private InsurancesTypeEnum isActive;


}
