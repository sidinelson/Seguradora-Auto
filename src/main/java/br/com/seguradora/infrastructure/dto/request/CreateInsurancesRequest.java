package br.com.seguradora.infrastructure.dto.request;

import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;

import java.time.LocalDateTime;

public record CreateInsurancesRequest(Long customerId, Long CarId, InsurancesTypeEnum tipo) {

}
