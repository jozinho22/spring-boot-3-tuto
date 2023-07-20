package com.douineau.tuto.model;

import jakarta.persistence.*;

@Entity
@Table(name="PT_EMP")
@AssociationOverride(
        name="address",
        joinColumns=@JoinColumn(name="ADDR_ID"))
public class PartTimeEmployee extends Employee {

    // Inherited empId field mapped to PT_EMP.EMPID
    // Inherited version field mapped to PT_EMP.VERSION
    // address field mapping overridden to PT_EMP.ADDR_ID fk
    @Column(name="wage")
    protected Float hourlyWage;

}
