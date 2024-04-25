package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.application.gateway.DriversGateway;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.repository.DriversEntityRepository;
import org.springframework.stereotype.Component;

import static br.com.seguradora.infrastructure.utils.Util.log;

@Component
public class DriversRepositoryGateway implements DriversGateway {

    private DriversEntityRepository driversEntityRepository;
    private DriversEntityMapper driversEntityMapper;

    public DriversRepositoryGateway(DriversEntityRepository driversEntityRepository, DriversEntityMapper driversEntityMapper) {
        this.driversEntityRepository = driversEntityRepository;
        this.driversEntityMapper = driversEntityMapper;
    }


    @Override
    public Boolean createDrivers(Drivers drivers) {
        try {
            log.info("#### Inicio da criação do Drivers::CreateCarsGatewayimpl");
            var driversSave = driversEntityRepository.save(driversEntityMapper.toEntity(drivers));
            log.info("#### Fim da criação do Drivers::CreateDriversGatewayimpl");
            return true;
        }catch(Exception e){
            log.error("#### error da criação do Drivers::CreateDriversGatewayimpl  "+e);
            return false;
        }
    }


}
