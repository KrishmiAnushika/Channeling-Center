/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient;

import edu.ijse.doctor_chaneling_center.dao.SuperDAO;
import edu.ijse.doctor_chaneling_center.dto.AppointmentDTO;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;

/**
 *
 * @author USER
 */
public interface AppointmentDAO extends SuperDAO<AppointmentDTO> {
    public AppointmentDTO searchByPatientId(String id)throws Exception;
    public int getLastAppointmentNo(String docId)throws Exception;
            
}
