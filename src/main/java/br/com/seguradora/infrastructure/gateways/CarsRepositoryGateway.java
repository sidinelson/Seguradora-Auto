package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.application.gateway.CarsGateway;
import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.repository.CarsEntityRepository;
import org.springframework.stereotype.Component;
import static br.com.seguradora.infrastructure.utils.Util.log;
@Component
public class CarsRepositoryGateway implements CarsGateway {

    private CarsEntityRepository carsEntityRepository;

    private CarsEntityMapper carsEntityMapper;

    public CarsRepositoryGateway(CarsEntityRepository carsEntityRepository, CarsEntityMapper carsEntityMapper) {
        this.carsEntityRepository = carsEntityRepository;
        this.carsEntityMapper = carsEntityMapper;
    }

    @Override
    public Cars create(Cars cars) {
        try {
            log.info("#### Inicio da criação do Cars::CarsRepositoryGateway");
            CarsEntity entity = carsEntityMapper.toEntity(cars);
            CarsEntity novoDrivers =carsEntityRepository.save(entity);
            log.info("#### Fim da criação do Cars::CarsRepositoryGateway");
            return carsEntityMapper.toEntity(novoDrivers);

        }catch(Exception e){
            log.error("#### error da criação do Cars::CarsRepositoryGateway");
            return null;
        }

    }
}
