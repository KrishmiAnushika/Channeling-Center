/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.SpecialityController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.SpecialityDAO;
import edu.ijse.doctor_chaneling_center.dto.SpecialityDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SpecialityControllerImpl implements SpecialityController {

    private SpecialityDAO specialityDAO;

    public SpecialityControllerImpl() {
        specialityDAO = (SpecialityDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SPECIALITY);
    }

    @Override
    public boolean add(SpecialityDTO specialityDTO) throws Exception {
        return specialityDAO.add(specialityDTO);
    }

    @Override
    public boolean update(SpecialityDTO specialityDTO) throws Exception {
        return specialityDAO.update(specialityDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return specialityDAO.delete(key);
    }

    @Override
    public SpecialityDTO search(String key) throws Exception {
        return specialityDAO.search(key);
    }

    @Override
    public ArrayList<SpecialityDTO> getAll() throws Exception {
        return specialityDAO.getAll();
    }

    @Override
    public SpecialityDTO searchByName(String name) throws Exception {
        return specialityDAO.search(name);
    }

}
