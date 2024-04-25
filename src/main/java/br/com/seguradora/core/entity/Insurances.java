package br.com.seguradora.core.entity;

import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;
import br.com.seguradora.infrastructure.persistence.CarsEntity;

import java.time.LocalDateTime;

public class Insurances {
    private Long id;
    private Customer customerId;
    private LocalDateTime creationDt;
    private LocalDateTime updatedDt;
    private Cars cardsId;
    private InsurancesTypeEnum isActive;


    public Insurances(Long id, Customer customerId, LocalDateTime creationDt, LocalDateTime updatedDt, Cars cardsId, InsurancesTypeEnum isActive) {
        this.id = id;
        this.customerId = customerId;
        this.creationDt = LocalDateTime.now();
        this.updatedDt = updatedDt;
        this.cardsId = cardsId;
        this.isActive = isActive;
    }


    public Insurances(Customer customerId, LocalDateTime creationDt, LocalDateTime updatedDt, Cars cardsId, InsurancesTypeEnum isActive) {
        this.customerId = customerId;
        this.creationDt = LocalDateTime.now();
        this.updatedDt = updatedDt;
        this.cardsId = cardsId;
        this.isActive = isActive;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getCreationDt() {
        return creationDt;
    }

    public void setCreationDt(LocalDateTime creationDt) {
        this.creationDt = creationDt;
    }

    public LocalDateTime getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(LocalDateTime updatedDt) {
        this.updatedDt = updatedDt;
    }

    public Cars getCardsId() {
        return cardsId;
    }

    public void setCardsId(Cars cardsId) {
        this.cardsId = cardsId;
    }

    public InsurancesTypeEnum getIsActive() {
        return isActive;
    }

    public void setIsActive(InsurancesTypeEnum isActive) {
        this.isActive = isActive;
    }
}
