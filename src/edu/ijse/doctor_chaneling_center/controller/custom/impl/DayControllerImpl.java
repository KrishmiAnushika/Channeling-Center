/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.DayController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.DayDAO;
import edu.ijse.doctor_chaneling_center.dto.DayDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DayControllerImpl implements DayController {

    private DayDAO dayDAO;

    public DayControllerImpl() {
        dayDAO = (DayDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DAY);
    }

    @Override
    public boolean add(DayDTO dayDTO) throws Exception {
        return dayDAO.add(dayDTO);
    }

    @Override
    public boolean update(DayDTO dayDTO) throws Exception {
        return dayDAO.update(dayDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return dayDAO.delete(key);
    }

    @Override
    public DayDTO search(String key) throws Exception {
        return dayDAO.search(key);
    }

    @Override
    public ArrayList<DayDTO> getAll() throws Exception {
        return dayDAO.getAll();
    }

}
