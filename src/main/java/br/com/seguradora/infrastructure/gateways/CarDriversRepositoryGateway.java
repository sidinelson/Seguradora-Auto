package br.com.seguradora.infrastructure.gateways;


import br.com.seguradora.application.gateway.CarDriversGateway;
import br.com.seguradora.core.entity.CarDrivers;
import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import br.com.seguradora.infrastructure.repository.CarDriversEntityRepository;
import br.com.seguradora.infrastructure.repository.DriversEntityRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import static br.com.seguradora.infrastructure.utils.Util.log;

@Component
public class CarDriversRepositoryGateway  implements CarDriversGateway {

    private CarDriversEntityRepository carDriversEntityRepository;

    private CarDriversEntityMapper entityMapper;

    private DriversEntityRepository driversEntityRepository;
    private DriversEntityMapper driversEntityMapper;

    public CarDriversRepositoryGateway(CarDriversEntityRepository carDriversEntityRepository, CarDriversEntityMapper entityMapper, DriversEntityRepository driversEntityRepository, DriversEntityMapper driversEntityMapper) {
        this.carDriversEntityRepository = carDriversEntityRepository;
        this.entityMapper = entityMapper;
        this.driversEntityRepository = driversEntityRepository;
        this.driversEntityMapper = driversEntityMapper;
    }

    @Override
    public Boolean createCarDrivers(CarDrivers carDrivers) {
        try {
            log.info("#### Inicio da criação do CarDrivers::CarDriversRepositoryGateway");
            DriversEntity driversEntity = new DriversEntity();
            driversEntity.setId(carDrivers.getDriversId().getId());

            CarsEntity carsEntity = new CarsEntity();
            carsEntity.setId(carDrivers.getCarsId().getId());
            Long auxId = carDrivers.getDriversId().getId();
            Optional<DriversEntity> driverIdade = Optional.of(new DriversEntity());
            driverIdade = driversEntityRepository.findById(driversEntity.getId());
            int idade = idade(driverIdade.get().getBirthdate());
            if(idade >= 18 && idade <= 25){
                carDrivers.setIsMainDriver(InsurancesTypeEnum.ATIVO);
            }else{
                carDrivers.setIsMainDriver(InsurancesTypeEnum.INATIVO);
            }
            var carDrivesSave = carDriversEntityRepository.save(entityMapper.toEntity(carDrivers,driversEntity,carsEntity));
            log.info("#### Fim da criação do CarDrivers::CarDriversRepositoryGateway");
            return true;
        }catch(Exception e){
            log.error("#### error da criação do CarDrivers::CarDriversRepositoryGateway  "+e);
            return false;
        }
    }


    public static int idade(final LocalDate aniversario) {
        return Period.between(aniversario, LocalDate.now()).getYears();
    }
}
