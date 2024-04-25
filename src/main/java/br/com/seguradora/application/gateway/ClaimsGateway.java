package br.com.seguradora.application.gateway;


import br.com.seguradora.core.entity.Claims;

public interface ClaimsGateway {

    Boolean createClaims(Claims claims);
}
