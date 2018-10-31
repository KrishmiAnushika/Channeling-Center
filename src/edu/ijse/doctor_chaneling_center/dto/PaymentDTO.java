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
public class PaymentDTO extends SuperDTO implements Serializable {

    private String payId;

    private String date;
    
    private String time;

    private double amount;

    private double discount;

    private double exraCharj;
    
    private String appId;

    public PaymentDTO() {
    }

    public PaymentDTO(String payId, String date, String time, double amount, double discount, double exraCharj, String appId) {
        this.payId = payId;
        this.date = date;
        this.time = time;
        this.amount = amount;
        this.discount = discount;
        this.exraCharj = exraCharj;
        this.appId = appId;
    }

    /**
     * @return the payId
     */
    public String getPayId() {
        return payId;
    }

    /**
     * @param payId the payId to set
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the exraCharj
     */
    public double getExraCharj() {
        return exraCharj;
    }

    /**
     * @param exraCharj the exraCharj to set
     */
    public void setExraCharj(double exraCharj) {
        this.exraCharj = exraCharj;
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

}
