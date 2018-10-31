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
public class DoctorDTO extends SuperDTO implements Serializable {

    private String docid;

    private String docName;

    private String docAddress;

    private int docTele;

    private String hospital;

    private int hTele;

    private String gender;

    private int patientLimit;
    
    private double docCharge;

    private String specialityId;

    public DoctorDTO() {
    }

    public DoctorDTO(String docid, String docName, String docAddress, int docTele, String hospital, int hTele, String gender, int patientLimit, double docCharge, String specialityId) {
        this.docid = docid;
        this.docName = docName;
        this.docAddress = docAddress;
        this.docTele = docTele;
        this.hospital = hospital;
        this.hTele = hTele;
        this.gender = gender;
        this.patientLimit = patientLimit;
        this.docCharge = docCharge;
        this.specialityId = specialityId;
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
     * @return the docName
     */
    public String getDocName() {
        return docName;
    }

    /**
     * @param docName the docName to set
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /**
     * @return the docAddress
     */
    public String getDocAddress() {
        return docAddress;
    }

    /**
     * @param docAddress the docAddress to set
     */
    public void setDocAddress(String docAddress) {
        this.docAddress = docAddress;
    }

    /**
     * @return the docTele
     */
    public int getDocTele() {
        return docTele;
    }

    /**
     * @param docTele the docTele to set
     */
    public void setDocTele(int docTele) {
        this.docTele = docTele;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    /**
     * @return the hTele
     */
    public int gethTele() {
        return hTele;
    }

    /**
     * @param hTele the hTele to set
     */
    public void sethTele(int hTele) {
        this.hTele = hTele;
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
     * @return the patientLimit
     */
    public int getPatientLimit() {
        return patientLimit;
    }

    /**
     * @param patientLimit the patientLimit to set
     */
    public void setPatientLimit(int patientLimit) {
        this.patientLimit = patientLimit;
    }

    /**
     * @return the docCharge
     */
    public double getDocCharge() {
        return docCharge;
    }

    /**
     * @param docCharge the docCharge to set
     */
    public void setDocCharge(double docCharge) {
        this.docCharge = docCharge;
    }

    /**
     * @return the specialityId
     */
    public String getSpecialityId() {
        return specialityId;
    }

    /**
     * @param specialityId the specialityId to set
     */
    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

   
}
