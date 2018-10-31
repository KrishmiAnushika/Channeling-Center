
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.DoctorController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.DoctorDAO;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import edu.ijse.doctor_chaneling_center.dto.SheduleDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DoctorControllerImpl implements DoctorController {

    private DoctorDAO doctorDAO;

    public DoctorControllerImpl() {
        doctorDAO = (DoctorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTOR);
    }

    @Override
    public boolean add(DoctorDTO doctorDTO) throws Exception {
        return doctorDAO.add(doctorDTO);
    }

    @Override
    public boolean update(DoctorDTO doctorDTO) throws Exception {
        return doctorDAO.update(doctorDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return doctorDAO.delete(key);
    }

    @Override
    public DoctorDTO search(String key) throws Exception {
        return doctorDAO.search(key);
    }

    @Override
    public ArrayList<DoctorDTO> getAll() throws Exception {
        return doctorDAO.getAll();
    }

    @Override
    public boolean addDoctor(DoctorDTO doctorDTO, ArrayList<SheduleDTO> sheduleList) throws Exception {
        return  doctorDAO.addDoctor(doctorDTO, sheduleList);
    }

    @Override
    public boolean updateDoctor(DoctorDTO doctorDTO, ArrayList<SheduleDTO> sheduleList) throws Exception {
        return doctorDAO.updateDoctor(doctorDTO, sheduleList);
    }

    @Override
    public boolean updatePatientCount(String docId, int patientCount) throws Exception {
        return doctorDAO.updatePatientCount(docId, patientCount);
    }

}
