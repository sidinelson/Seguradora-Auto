package br.com.seguradora.application.usecaseimpl;

import br.com.seguradora.application.gateway.ClaimsGateway;
import br.com.seguradora.core.entity.Claims;
import br.com.seguradora.core.usecase.CreateClaimsUseCase;

public class CreateClaimsUseCaseImpl implements CreateClaimsUseCase {

    private ClaimsGateway claimsGateway;

    public CreateClaimsUseCaseImpl(ClaimsGateway claimsGateway) {
        this.claimsGateway = claimsGateway;
    }


    @Override
    public void execute(Claims claims) {
        claimsGateway.createClaims(claims);
    }
}
