package br.com.seguradora.core.entity;

public class Customer {

    private Long id;
    private String name;
    private Drivers driversId;

    public Customer(Long id, String name, Drivers driversId) {
        this.id = id;
        this.name = name;
        this.driversId = driversId;
    }

    public Customer(String name, Drivers driversId) {
        this.name = name;
        this.driversId = driversId;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drivers getDriversId() {
        return driversId;
    }

    public void setDriversId(Drivers driversId) {
        this.driversId = driversId;
    }
}
