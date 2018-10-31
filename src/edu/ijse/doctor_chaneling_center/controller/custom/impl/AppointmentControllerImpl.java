/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.AppointmentController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.AppointmentDAO;
import edu.ijse.doctor_chaneling_center.dto.AppointmentDTO;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class AppointmentControllerImpl implements AppointmentController {

    private AppointmentDAO appointmentDAO;

    public AppointmentControllerImpl() {
        appointmentDAO = (AppointmentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.APPOINTMENT);
    }

    @Override
    public boolean add(AppointmentDTO appointmentDTO) throws Exception {
        return appointmentDAO.add(appointmentDTO);
    }

    @Override
    public boolean update(AppointmentDTO appointmentDTO) throws Exception {
        return appointmentDAO.update(appointmentDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return appointmentDAO.delete(key);
    }

    @Override
    public AppointmentDTO search(String key) throws Exception {
        return appointmentDAO.search(key);
    }

    @Override
    public ArrayList<AppointmentDTO> getAll() throws Exception {
        return appointmentDAO.getAll();
    }

    @Override
    public AppointmentDTO searchByPatientId(String id) throws Exception {
       return appointmentDAO.searchByPatientId(id);
    }

    @Override
    public int getLastAppointmentNo(String docId) throws Exception {
        return appointmentDAO.getLastAppointmentNo(docId);
    }

    

   
    

}
