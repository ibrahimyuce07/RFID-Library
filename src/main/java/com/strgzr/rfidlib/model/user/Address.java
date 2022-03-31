package com.strgzr.rfidlib.model.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "library_user_address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "area")
    private String area;

    @Column(name = "street")
    private String street;

    @Column(name = "detail")
    private String detail;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "is_default")
    private int isDefault;
}
