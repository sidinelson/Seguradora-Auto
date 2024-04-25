package br.com.seguradora.core.entity;

import br.com.seguradora.core.entity.enums.InsurancesTypeEnum;
import br.com.seguradora.core.entity.enums.TransactionStatusEnum;

public class CarDrivers {
    private Long id;

    private Drivers driversId;

    private Cars carsId;

    private InsurancesTypeEnum isMainDriver;

    public CarDrivers(Long id, Drivers driversId, Cars carsId, InsurancesTypeEnum isMainDriver) {
        this.id = id;
        this.driversId = driversId;
        this.carsId = carsId;
        this.isMainDriver = isMainDriver;
    }

    public CarDrivers(Drivers driversId, Cars carsId, InsurancesTypeEnum isMainDriver) {
        this.driversId = driversId;
        this.carsId = carsId;
        this.isMainDriver = isMainDriver;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Drivers getDriversId() {
        return driversId;
    }

    public void setDriversId(Drivers driversId) {
        this.driversId = driversId;
    }

    public Cars getCarsId() {
        return carsId;
    }

    public void setCarsId(Cars carsId) {
        this.carsId = carsId;
    }

    public InsurancesTypeEnum getIsMainDriver() {
        return isMainDriver;
    }

    public void setIsMainDriver(InsurancesTypeEnum isMainDriver) {
        this.isMainDriver = isMainDriver;
    }
}
