package br.com.seguradora.infrastructure.dto.response;

public record ValidationError(String field, String message) {
}
