package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.entity.Customer;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.core.entity.Insurances;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.persistence.CustomerEntity;
import br.com.seguradora.infrastructure.persistence.InsurancesEntity;
import org.springframework.stereotype.Component;


@Component
public class InsurancesEntityMapper {

    public InsurancesEntity toEntity(Insurances insurances, CustomerEntity customerEntity, CarsEntity carsEntity){
        return new InsurancesEntity(insurances.getId(),
                                    customerEntity,
                                    null,
                                    null,
                                    carsEntity,
                                    insurances.getIsActive());
    }

    public Insurances toInsurances(InsurancesEntity insurancesEntity, Customer customer, Cars cars){

        return new Insurances(insurancesEntity.getId(),
                              customer,
                              insurancesEntity.getCreationDt(),
                              insurancesEntity.getUpdateDat(),
                              cars,
                              insurancesEntity.getIsActive());
    }
}
