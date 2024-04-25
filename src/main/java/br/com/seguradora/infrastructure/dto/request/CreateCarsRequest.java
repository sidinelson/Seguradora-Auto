package br.com.seguradora.infrastructure.dto.request;


import java.math.BigDecimal;

public record CreateCarsRequest(String model, String manufacturer, String years, BigDecimal fipeValue ) {
}
