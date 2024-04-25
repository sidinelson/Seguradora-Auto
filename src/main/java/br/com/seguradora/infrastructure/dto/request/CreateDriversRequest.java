package br.com.seguradora.infrastructure.dto.request;

import java.time.LocalDate;


public record CreateDriversRequest(String document, LocalDate birthdate) {}
