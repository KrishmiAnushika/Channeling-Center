/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dto;

import java.io.Serializable;

/**
 *
 * @author USER
 */

public class AppointmentDTO extends SuperDTO implements Serializable {

    private String appId;
  
    private int appNo;
   
    private String appDate;
    
    private String appTime;
    private String bookingDate;
    private String bookingTime;
    
    private String docId;
   
    private String patId;

    public AppointmentDTO() {
    }

    public AppointmentDTO(String appId, int appNo, String appDate, String appTime, String bookingDate, String bookingTime, String docId, String patId) {
        this.appId = appId;
        this.appNo = appNo;
        this.appDate = appDate;
        this.appTime = appTime;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.docId = docId;
        this.patId = patId;
    }

    /**
     * @return the appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId the appId to set
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * @return the appNo
     */
    public int getAppNo() {
        return appNo;
    }

    /**
     * @param appNo the appNo to set
     */
    public void setAppNo(int appNo) {
        this.appNo = appNo;
    }

    /**
     * @return the appDate
     */
    public String getAppDate() {
        return appDate;
    }

    /**
     * @param appDate the appDate to set
     */
    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    /**
     * @return the appTime
     */
    public String getAppTime() {
        return appTime;
    }

    /**
     * @param appTime the appTime to set
     */
    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    /**
     * @return the bookingDate
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * @param bookingDate the bookingDate to set
     */
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    /**
     * @return the bookingTime
     */
    public String getBookingTime() {
        return bookingTime;
    }

    /**
     * @param bookingTime the bookingTime to set
     */
    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    /**
     * @return the docId
     */
    public String getDocId() {
        return docId;
    }

    /**
     * @param docId the docId to set
     */
    public void setDocId(String docId) {
        this.docId = docId;
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

   
}  

   

   