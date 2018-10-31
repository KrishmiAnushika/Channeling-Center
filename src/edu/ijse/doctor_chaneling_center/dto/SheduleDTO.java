/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author USER
 */

public class SheduleDTO extends SuperDTO implements Serializable{
    private String room_no;
    private String time;
    private String docid;
    private String dayid;

    public SheduleDTO() {
    }

    public SheduleDTO(String room_no, String time, String docid, String dayid) {
        this.room_no = room_no;
        this.time = time;
        this.docid = docid;
        this.dayid = dayid;
    }

    /**
     * @return the room_no
     */
    public String getRoom_no() {
        return room_no;
    }

    /**
     * @param room_no the room_no to set
     */
    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the docid
     */
    public String getDocid() {
        return docid;
    }

    /**
     * @param docid the docid to set
     */
    public void setDocid(String docid) {
        this.docid = docid;
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

    
    
}