package br.com.seguradora.core.entity;

import java.time.LocalDate;

public class Claims {

    private Long id;
    private Cars carsId;
    private Drivers driversId;

    private LocalDate eventDate;

    public Claims(Long id, Cars carsId, Drivers driversId, LocalDate eventDate) {
        this.id = id;
        this.carsId = carsId;
        this.driversId = driversId;
        this.eventDate = eventDate;
    }


    public Claims(Cars carsId, Drivers driversId, LocalDate eventDate) {
        this.carsId = carsId;
        this.driversId = driversId;
        this.eventDate = eventDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cars getCarsId() {
        return carsId;
    }

    public void setCarsId(Cars carsId) {
        this.carsId = carsId;
    }

    public Drivers getDriversId() {
        return driversId;
    }

    public void setDriversId(Drivers driversId) {
        this.driversId = driversId;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
}
