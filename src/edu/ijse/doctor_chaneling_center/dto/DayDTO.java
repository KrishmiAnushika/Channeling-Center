/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
/*@Entity
@Table(name = "day")
@NamedQueries({
@NamedQuery(name = "Day.findAll", query = "SELECT d FROM Day d")})*/
public class DayDTO extends SuperDTO implements Serializable{
    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    
    private String dayid;
    
    private String dayname;

    public DayDTO() {
    }

    public DayDTO(String dayid, String dayname) {
        this.dayid = dayid;
        this.dayname = dayname;
    }

    /**
     * @return the dayid
     */
    public String getDayid() {
        return dayid;
    }

    /**
     * @param dayid the dayid to set
     */
    public void setDayid(String dayid) {
        this.dayid = dayid;
    }

    /**
     * @return the dayname
     */
    public String getDayname() {
        return dayname;
    }

    /**
     * @param dayname the dayname to set
     */
    public void setDayname(String dayname) {
        this.dayname = dayname;
    }

    
}
