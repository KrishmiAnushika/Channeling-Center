/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USER
 */

public class PatientDTO extends SuperDTO implements Serializable {
    
    
    private String patId;
    
    private String patName;
    
    private String patAddress;
    
    private int patTele;
    
    private String gender;
    
    private int age;

    public PatientDTO() {
    }

    public PatientDTO(String patId, String patName, String patAddress, int patTele, String gender, int age) {
        this.patId = patId;
        this.patName = patName;
        this.patAddress = patAddress;
        this.patTele = patTele;
        this.gender = gender;
        this.age = age;
    }

    /**
     * @return the patId
     */
    public String getPatId() {
        return patId;
    }

    /**
     * @param patId the patId to set
     */
    public void setPatId(String patId) {
        this.patId = patId;
    }

    /**
     * @return the patName
     */
    public String getPatName() {
        return patName;
    }

    /**
     * @param patName the patName to set
     */
    public void setPatName(String patName) {
        this.patName = patName;
    }

    /**
     * @return the patAddress
     */
    public String getPatAddress() {
        return patAddress;
    }

    /**
     * @param patAddress the patAddress to set
     */
    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    /**
     * @return the patTele
     */
    public int getPatTele() {
        return patTele;
    }

    /**
     * @param patTele the patTele to set
     */
    public void setPatTele(int patTele) {
        this.patTele = patTele;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

   
    }

    