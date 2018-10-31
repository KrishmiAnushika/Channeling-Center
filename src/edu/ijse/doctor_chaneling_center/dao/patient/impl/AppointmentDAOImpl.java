/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.dao.patient.AppointmentDAO;
import edu.ijse.doctor_chaneling_center.db.ConnectionFactory;
import edu.ijse.doctor_chaneling_center.dto.AppointmentDTO;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class AppointmentDAOImpl implements AppointmentDAO {

    private Connection connction;

    public AppointmentDAOImpl() {
        connction = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(AppointmentDTO t) throws Exception {
        String sql = "INSERT INTO Appointment VALUES (?,?,?,?,?,?,?,?);";

        java.sql.PreparedStatement pstm = connction.prepareStatement(sql);

        pstm.setString(1, t.getAppId());
        pstm.setInt(2, t.getAppNo());
        pstm.setString(3, t.getAppDate());
        pstm.setString(4, t.getAppTime());
        pstm.setString(5, t.getBookingDate());
        pstm.setString(6, t.getBookingTime());
        pstm.setString(7, t.getDocId());
        pstm.setString(8, t.getPatId());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean update(AppointmentDTO t) throws Exception {
        String sql = "UPDATE Appointment SET app_no=?, appdate=?,apptime=?, bookingDate=?, bookingTime=? docid=?, patnic=? WHERE appid =?";

        java.sql.PreparedStatement pstm = connction.prepareStatement(sql);

       
        pstm.setInt(1, t.getAppNo());
        pstm.setString(2, t.getAppDate());
        pstm.setString(3, t.getAppTime());
        pstm.setString(4, t.getBookingDate());
        pstm.setString(5, t.getBookingTime());
        pstm.setString(6, t.getDocId());
        pstm.setString(7, t.getPatId());
        pstm.setString(8, t.getAppId());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Appointment WHERE appid ='" + key + "'";

        Statement stm = connction.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public AppointmentDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Appointment WHERE appid = '" + key + "'";

        AppointmentDTO appointmentDTO = null;

        Statement stm = connction.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            appointmentDTO = new AppointmentDTO(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7),rst.getString(8));
        }
        return appointmentDTO;

    }

    @Override
    public ArrayList<AppointmentDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Appointment";

        ArrayList<AppointmentDTO> allApointments = new ArrayList<>();

        Statement stm = connction.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            AppointmentDTO appointmentDTO = new AppointmentDTO(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7),rst.getString(8));

            allApointments.add(appointmentDTO);
        }
        return allApointments;

    }

    @Override
    public AppointmentDTO searchByPatientId(String id) throws Exception {
        String sql = "SELECT * FROM Appointment WHERE patId = '" + id + "'";

        AppointmentDTO appointmentDTO = null;

        Statement stm = connction.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            appointmentDTO = new AppointmentDTO(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7),rst.getString(8));
        }
        return appointmentDTO;

    }

    @Override
    public int getLastAppointmentNo(String docId) throws Exception {
        String sql = "select  app_No from appointment where docId = '"+docId+"' order by 1 desc limit 1";
        Connection conn = ConnectionFactory.getInstance().getConnection();

        Statement stm = conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return  rst.getInt(1);
        }
        return 0; 
    }

    
}
