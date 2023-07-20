package com.douineau.tuto.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@MappedSuperclass
public class Employee {

    @Id
    protected Integer empId;
    @Version
    protected Integer version;
    @ManyToOne
    @JoinColumn(name="ADDR")
    protected Adress adress;

}