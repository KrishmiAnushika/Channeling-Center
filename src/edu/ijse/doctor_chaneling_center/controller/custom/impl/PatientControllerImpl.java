/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.PatientController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.PatientDAO;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PatientControllerImpl implements PatientController {

    private PatientDAO patientDAO;

    public PatientControllerImpl() {
        patientDAO = (PatientDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PATIENT);
    }

    @Override
    public boolean add(PatientDTO patientDTO) throws Exception {
        return patientDAO.add(patientDTO);
    }

    @Override
    public boolean update(PatientDTO patientDTO) throws Exception {
        return patientDAO.update(patientDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return patientDAO.delete(key);
    }

    @Override
    public PatientDTO search(String key) throws Exception {
        return patientDAO.search(key);
    }

    @Override
    public ArrayList<PatientDTO> getAll() throws Exception {
        return patientDAO.getAll();
    }

    @Override
    public PatientDTO searchByPatientName(String name) throws Exception {
        return patientDAO.searchByPatientName(name);
    }

}
