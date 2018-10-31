/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.dao.patient.PatientDAO;
import edu.ijse.doctor_chaneling_center.db.ConnectionFactory;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import edu.ijse.doctor_chaneling_center.dto.PatientDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PatientDAOImpl implements PatientDAO{
    private Connection connection;
    
    public PatientDAOImpl(){
        connection=ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(PatientDTO t) throws Exception {
        String sql = "INSERT INTO Patient VALUES (?,?,?,?,?,?);";
        
        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);
        
        
        pstm.setString(1, t.getPatId());
        pstm.setString(2, t.getPatName());
        pstm.setString(3, t.getPatAddress());
        pstm.setInt(4, t.getPatTele());
        pstm.setString(5, t.getGender());
        pstm.setInt(6, t.getAge());
       
       
        
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(PatientDTO t) throws Exception {
        String sql = "UPDATE Patient SET patname=?, pataddress=?,pattele=?, gender=?, age=? WHERE patId =?";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        
        pstm.setString(1, t.getPatName());
        pstm.setString(2, t.getPatAddress());
        pstm.setInt(3, t.getPatTele());
        pstm.setString(4, t.getGender());
        pstm.setInt(5, t.getAge());
        pstm.setString(6, t.getPatId());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Patient WHERE patId = '" + key + "'";

        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public PatientDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Patient WHERE patId = '" + key + "'";

        PatientDTO patientDTO = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            patientDTO = new PatientDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getString(5), rst.getInt(6));

        }

        return patientDTO;
    }

    @Override
    public ArrayList<PatientDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Patient";

        ArrayList<PatientDTO> allPatients = new ArrayList<>();

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            PatientDTO patientDTO = new PatientDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getString(5), rst.getInt(6));
            
            allPatients.add(patientDTO);
        }
        return allPatients;
    }

    @Override
    public PatientDTO searchByPatientName(String name) throws Exception {
       String sql = "SELECT * FROM Patient WHERE patName = '" + name + "'";

        PatientDTO patientDTO = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            patientDTO = new PatientDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getString(5), rst.getInt(6));

        }

        return patientDTO; 
    }
}
