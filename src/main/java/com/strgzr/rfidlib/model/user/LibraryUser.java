package com.strgzr.rfidlib.model.user;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "library_user")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public boolean isBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(boolean borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public LocalDateTime getLastBorrowTime() {
        return lastBorrowTime;
    }

    public void setLastBorrowTime(LocalDateTime lastBorrowTime) {
        this.lastBorrowTime = lastBorrowTime;
    }

    public LocalDateTime getLastReturnTime() {
        return lastReturnTime;
    }

    public void setLastReturnTime(LocalDateTime lastReturnTime) {
        this.lastReturnTime = lastReturnTime;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public int getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(int returnCount) {
        this.returnCount = returnCount;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
}
