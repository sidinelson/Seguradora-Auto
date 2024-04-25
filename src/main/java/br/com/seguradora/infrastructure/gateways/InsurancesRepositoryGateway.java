package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.application.gateway.InsurancesGateway;
import br.com.seguradora.core.entity.Insurances;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.persistence.CustomerEntity;
import br.com.seguradora.infrastructure.repository.InsurancesEntityRepository;
import org.springframework.stereotype.Component;

import static br.com.seguradora.infrastructure.utils.Util.log;

@Component
public class InsurancesRepositoryGateway implements InsurancesGateway {
    private InsurancesEntityRepository insurancesEntityRepository;
    private InsurancesEntityMapper entityMapper;

    public InsurancesRepositoryGateway(InsurancesEntityRepository insurancesEntityRepository, InsurancesEntityMapper entityMapper) {
        this.insurancesEntityRepository = insurancesEntityRepository;
        this.entityMapper = entityMapper;
    }


    @Override
    public Boolean createInsurances(Insurances insurances) {
        try {
            log.info("#### Inicio da criação do Insurances::InsurancesRepositoryGateway");
            CustomerEntity customerEntity = new CustomerEntity();
            customerEntity.setId(insurances.getCustomerId().getId());

            CarsEntity carsEntity = new CarsEntity();
            carsEntity.setId(insurances.getCardsId().getId());

            var insurancesSave = insurancesEntityRepository.save(entityMapper.toEntity(insurances,customerEntity,carsEntity));
            log.info("#### Fim da criação do Insurances::InsurancesRepositoryGateway");
            return true;
        }catch(Exception e){
            log.error("#### error da criação do Insurances::InsurancesRepositoryGateway  "+e);
            return false;
        }
    }
}
