package com.springapp.mvc;

import javax.persistence.*;

/**
 * Created by Wajih Sid on 10/28/2015.
 */
@Entity
@Table(name = "emp")
public class User
{

    private Integer ID;
    private String NAME;
    private String EMAIL;
    private String ROLE;




    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Column(name = "ROLE")
    public String getROLE() {
        return ROLE;
    }


    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    @Column(name = "NAME")
    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Column(name = "EMAIL")
    public String getEMAIL() {
        return EMAIL;
    }



    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                '}';
    }
}
