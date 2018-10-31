/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient;

import edu.ijse.doctor_chaneling_center.dao.SuperDAO;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import edu.ijse.doctor_chaneling_center.dto.SheduleDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface DoctorDAO extends SuperDAO<DoctorDTO> {
    public boolean addDoctor(DoctorDTO doctorDTO,ArrayList<SheduleDTO> sheduleList)throws Exception;
    public boolean updateDoctor(DoctorDTO doctorDTO,ArrayList<SheduleDTO> sheduleList)throws Exception;
    public boolean updatePatientCount(String docId,int patientCount)throws Exception;
}
