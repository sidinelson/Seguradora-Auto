package br.com.seguradora.core.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Cars {

    private Long id;
    private String model;
    private String manufacturer;
    private String years;
    private BigDecimal fipeValue;

    public Cars(Long id, String model, String manufacturer, String years, BigDecimal fipeValue) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.years = years;
        this.fipeValue = fipeValue;
    }

    public Cars(String model, String manufacturer, String years, BigDecimal fipeValue) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.years = years;
        this.fipeValue = fipeValue;
    }

    public Cars() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public BigDecimal getFipeValue() {
        return fipeValue;
    }

    public void setFipeValue(BigDecimal fipeValue) {
        this.fipeValue = fipeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Objects.equals(id, cars.id) && Objects.equals(model, cars.model) && Objects.equals(manufacturer, cars.manufacturer) && Objects.equals(years, cars.years) && Objects.equals(fipeValue, cars.fipeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, manufacturer, years, fipeValue);
    }
}
