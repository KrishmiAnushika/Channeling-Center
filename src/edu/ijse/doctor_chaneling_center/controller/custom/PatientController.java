/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom;

import edu.ijse.doctor_chaneling_center.controller.SuperController;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;

/**
 *
 * @author USER
 */
public interface PatientController extends SuperController<PatientDTO> {

   public PatientDTO searchByPatientName(String name)throws Exception;  
    
}
