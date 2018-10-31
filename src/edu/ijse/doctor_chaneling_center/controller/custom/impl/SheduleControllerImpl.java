/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.SheduleController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.SheduleDAO;
import edu.ijse.doctor_chaneling_center.dto.SheduleDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SheduleControllerImpl implements SheduleController {

    private SheduleDAO sheduleDAO;

    public SheduleControllerImpl() {
        sheduleDAO = (SheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SHEDULE);
    }

    @Override
    public boolean add(SheduleDTO sheduleDTO) throws Exception {
        return sheduleDAO.add(sheduleDTO);
    }

    @Override
    public boolean update(SheduleDTO sheduleDTO) throws Exception {
        return sheduleDAO.update(sheduleDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return sheduleDAO.delete(key);
    }

    @Override
    public SheduleDTO search(String key) throws Exception {
        return sheduleDAO.search(key);
    }

    @Override
    public ArrayList<SheduleDTO> getAll() throws Exception {
        return sheduleDAO.getAll();
    }

    @Override
    public boolean addShedule(SheduleDTO sheduleDTO, Connection conn) throws Exception {
        return sheduleDAO.addShedule(sheduleDTO, conn);
    }

    @Override
    public boolean updateShedule(SheduleDTO sheduleDTO, Connection conn) throws Exception {
        return sheduleDAO.updateShedule(sheduleDTO, conn);
    }

}
