/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller.custom.impl;

import edu.ijse.doctor_chaneling_center.controller.custom.PaymentController;
import edu.ijse.doctor_chaneling_center.dao.DAOFactory;
import edu.ijse.doctor_chaneling_center.dao.patient.PaymentDAO;
import edu.ijse.doctor_chaneling_center.dto.PaymentDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PaymentControllerImpl implements PaymentController {

    private PaymentDAO paymentDAO;

    public PaymentControllerImpl() {
        paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    }

    @Override
    public boolean add(PaymentDTO paymentDTO) throws Exception {
        return paymentDAO.add(paymentDTO);
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) throws Exception {
        return paymentDAO.update(paymentDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return paymentDAO.delete(key);
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
        return paymentDAO.search(key);
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        return paymentDAO.getAll();
    }

}
