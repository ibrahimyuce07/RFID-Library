package com.strgzr.rfidlib.model.user;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "library_user")
@Data
public class LibraryUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "rfid")
    private String rfid;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;
    @Column(name = "borrow_status")
    private boolean borrowStatus;
    @Column(name = "last_borrow_time")
    private LocalDateTime lastBorrowTime;
    @Column(name = "last_return_time")
    private LocalDateTime lastReturnTime;
    @Column(name = "borrow_count")
    private int borrowCount;
    @Column(name = "return_count")
    private int returnCount;
    @Column(name = "penalty")
    private int penalty;
    @Column(name = "is_admin")
    private boolean isAdmin;
    @Column(name = "register_date")
    private LocalDateTime registerDate;

}
