/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.dao.patient.DayDAO;
import edu.ijse.doctor_chaneling_center.db.ConnectionFactory;
import edu.ijse.doctor_chaneling_center.dto.AppointmentDTO;
import edu.ijse.doctor_chaneling_center.dto.DayDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DayDAOImpl implements DayDAO {

    private Connection connetion;

    public DayDAOImpl() {
        connetion = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(DayDTO t) throws Exception {
        String sql = "INSERT INTO Day VALUES (?,?);";

        java.sql.PreparedStatement pstm = connetion.prepareStatement(sql);

        pstm.setString(1, t.getDayid());
        pstm.setString(2, t.getDayname());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean update(DayDTO t) throws Exception {
        String sql = "UPDATE Day SET dayname=?, WHERE dayid =?";

        java.sql.PreparedStatement pstm = connetion.prepareStatement(sql);

        pstm.setString(1, t.getDayid());
        pstm.setString(2, t.getDayname());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Day WHERE dayid ='" + key + "'";

        Statement stm = connetion.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public DayDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Day WHERE dayid = '" + key + "'";

        DayDTO dayDTO = null;

        Statement stm = connetion.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            dayDTO = new DayDTO(rst.getString(1), rst.getString(2));
        }
        return dayDTO;
    }

    @Override
    public ArrayList<DayDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Day";

        ArrayList<DayDTO> allDays = new ArrayList<>();

        Statement stm = connetion.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            DayDTO dayDTO = new DayDTO(rst.getString(1), rst.getString(2));

            allDays.add(dayDTO);
        }
        return allDays;

    }

}
