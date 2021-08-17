package com.car.api.car_api.car;

import java.util.Date;

public class Car {
    
    private Integer id;
    private String make;
    private String model;
    private Date introductionYear;
    private String description;

    public Car(Integer id, String make, String model, Date introductionYear, String description) {
        super();
        this.id = id;
        this.make = make;
        this.model = model;
        this.introductionYear = introductionYear;
        this.description = description;
    }


    public Car() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getIntroductionYear() {
        return this.introductionYear;
    }

    public void setIntroductionYear(Date introductionYear) {
        this.introductionYear = introductionYear;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", introductionYear='" + getIntroductionYear() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
