package br.com.seguradora.application.usecaseimpl;

import br.com.seguradora.application.gateway.InsurancesGateway;
import br.com.seguradora.core.entity.Insurances;
import br.com.seguradora.core.usecase.CreateInsurancesUseCase;

public class CreateInsurancesUseCaseImpl implements CreateInsurancesUseCase {

    private InsurancesGateway insurancesGateway;

    public CreateInsurancesUseCaseImpl(InsurancesGateway insurancesGateway) {
        this.insurancesGateway = insurancesGateway;
    }


    @Override
    public void execute(Insurances insurances) {

        insurancesGateway.createInsurances(insurances);
    }
}
