package br.com.seguradora.infrastructure.dto.response;

import java.util.List;

public record ErrorResponse(String code, String messge, List<ValidationError> validitions){}
