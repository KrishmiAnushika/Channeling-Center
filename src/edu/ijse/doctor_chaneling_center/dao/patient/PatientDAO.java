/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient;

import edu.ijse.doctor_chaneling_center.dao.SuperDAO;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;

/**
 *
 * @author USER
 */
public interface PatientDAO extends SuperDAO<PatientDTO>{
    public PatientDTO searchByPatientName(String name)throws Exception; 
}
