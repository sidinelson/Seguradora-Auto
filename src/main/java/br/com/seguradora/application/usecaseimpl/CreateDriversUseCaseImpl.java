package br.com.seguradora.application.usecaseimpl;

import br.com.seguradora.application.gateway.DriversGateway;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.core.exceptions.BusinessException;
import br.com.seguradora.core.usecase.CreateDriversUseCase;
import br.com.seguradora.infrastructure.persistence.DriversEntity;

public class CreateDriversUseCaseImpl implements CreateDriversUseCase {

    private DriversGateway driversGateway;

    public CreateDriversUseCaseImpl(DriversGateway driversGateway) {
        this.driversGateway = driversGateway;
    }


    @Override
    public void execute(Drivers drivers) {

        driversGateway.createDrivers(drivers);
    }




}
