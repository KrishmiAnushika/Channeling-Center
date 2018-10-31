/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.dao.patient.PaymentDAO;
import edu.ijse.doctor_chaneling_center.db.ConnectionFactory;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;
import edu.ijse.doctor_chaneling_center.dto.PaymentDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author USER
 */
public class PaymentDAOImpl implements PaymentDAO{
     private Connection connection;
    
    public PaymentDAOImpl(){
        connection=ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(PaymentDTO t) throws Exception {
        String sql = "INSERT INTO Payment VALUES (?,?,?,?,?,?,?);";
        
        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, t.getPayId());
        pstm.setString(2, t.getDate());
        pstm.setString(3, t.getTime());
        pstm.setDouble(4, t.getAmount());
        pstm.setDouble(5, t.getDiscount());
        pstm.setDouble(6, t.getExraCharj());
        pstm.setString(7, t.getAppId());
       
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(PaymentDTO t) throws Exception {
        String sql = "UPDATE Payment SET date=?, time=?, amount=?, discount=?, exra_charj=?, appId=? WHERE payid =?";
        
        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);
        
        
        pstm.setString(1, t.getDate());
        pstm.setString(2, t.getTime());
        pstm.setDouble(3, t.getAmount());
        pstm.setDouble(4, t.getDiscount());
        pstm.setDouble(5, t.getExraCharj());
        pstm.setString(6, t.getAppId());
        pstm.setString(7, t.getPayId());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Payment WHERE payid ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);
    
        return (affectedRows > 0);
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Payment WHERE payid = '" + key + "'";
        
        PaymentDTO paymentDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
           paymentDTO=new PaymentDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7));
        }
    
        return paymentDTO;
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Payment";
        
        ArrayList<PaymentDTO> alPayments = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (alPayments == null){
                alPayments = new ArrayList<>();
            }
            PaymentDTO paymentDTO = new PaymentDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7));
            alPayments.add(paymentDTO);
        }
        return alPayments;
    }
}
    


