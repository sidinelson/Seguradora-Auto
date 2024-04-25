package br.com.seguradora.infrastructure.dto.request;

import java.time.LocalDate;

public record CreateClaimsRequest(Long carsId, Long driverId, LocalDate eventDate) {
}
