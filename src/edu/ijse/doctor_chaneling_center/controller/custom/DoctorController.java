/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom;

import edu.ijse.doctor_chaneling_center.controller.SuperController;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import edu.ijse.doctor_chaneling_center.dto.SheduleDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface DoctorController extends SuperController<DoctorDTO> {
    public boolean addDoctor(DoctorDTO doctorDTO,ArrayList<SheduleDTO> sheduleList)throws Exception;
    public boolean updateDoctor(DoctorDTO doctorDTO,ArrayList<SheduleDTO> sheduleList)throws Exception;
    public boolean updatePatientCount(String docId,int patientCount)throws Exception;
}
