package com.epam.ld.javabasics30.unit10.skils.formation.task01;

import java.util.Objects;

public class Customer {
    private String id;
    private String surname;
    private String name;
    private String fathersName;
    private String address;
    private long cardNumber;
    private String bankAccountNumber;

    public Customer(String id, String surname, String name, String fathersName, String address, long cardNumber, String bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return cardNumber == customer.cardNumber &&
                Objects.equals(id, customer.id) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(fathersName, customer.fathersName) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, fathersName, address, cardNumber, bankAccountNumber);
    }
}
