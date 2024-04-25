package br.com.seguradora.infrastructure.dto.request;

import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;
import br.com.seguradora.core.entity.enums.TransactionStatusEnum;

public record CreateCarDriversRequest(Long driverId, Long carsId, InsurancesTypeEnum isMainDriver) {

}
