package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    protected Client() {

    }

    public Client(Advisor advisor, String firstName, String lastName){
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private long getClientId(){
        return clientId;
    }

    private Advisor getAdvisor(){
        return advisor;
    }

    private void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }

    private String getFirstName(){
        return firstName;
    }

    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private String getLastName(){
        return lastName;
    }

    private void setLastName(String lastName){
        this.lastName = lastName;
    }

}
