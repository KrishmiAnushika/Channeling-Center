/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
public class SpecialityDTO extends SuperDTO implements Serializable {

    private String speid;

    private String spename;

    public SpecialityDTO() {
    }

    public SpecialityDTO(String speid, String spename) {
        this.speid = speid;
        this.spename = spename;
    }

    /**
     * @return the speid
     */
    public String getSpeid() {
        return speid;
    }

    /**
     * @param speid the speid to set
     */
    public void setSpeid(String speid) {
        this.speid = speid;
    }

    /**
     * @return the spename
     */
    public String getSpename() {
        return spename;
    }

    /**
     * @param spename the spename to set
     */
    public void setSpename(String spename) {
        this.spename = spename;
    }

}
