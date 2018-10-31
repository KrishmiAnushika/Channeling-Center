/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.dao.patient.SheduleDAO;
import edu.ijse.doctor_chaneling_center.db.ConnectionFactory;
import edu.ijse.doctor_chaneling_center.dto.DoctorDTO;
import edu.ijse.doctor_chaneling_center.dto.SheduleDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SheduleDAOImpl implements SheduleDAO {

    private Connection connection;

    public SheduleDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SheduleDTO t) throws Exception {
        String sql = "INSERT INTO Shedule VALUES (?,?,?,?);";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, t.getRoom_no());
        pstm.setString(2, t.getTime());
        pstm.setString(3, t.getDocid());
        pstm.setString(4, t.getDayid());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean update(SheduleDTO t) throws Exception {
        String sql = "UPDATE Shedule SET room_no=?, time=?, dayid=? WHERE docId =?";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, t.getRoom_no());
        pstm.setString(2, t.getTime());
        pstm.setString(3, t.getDocid());
        pstm.setString(4, t.getDayid());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Shedule WHERE docId ='" + key + "'";

        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public SheduleDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Shedule WHERE docId = '" + key + "'";

        SheduleDTO sheduleDTO = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            sheduleDTO = new SheduleDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }

        return sheduleDTO;
    }

    @Override
    public ArrayList<SheduleDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Shedule";

        ArrayList<SheduleDTO> allShedules = new ArrayList<>();

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            SheduleDTO sheduleDTO = new SheduleDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));

            allShedules.add(sheduleDTO);
        }
        return allShedules;
    }

    @Override
    public boolean addShedule(SheduleDTO sheduleDTO, Connection conn) throws Exception {
        String sql = "Insert into Shedule values ('" + sheduleDTO.getRoom_no() + "','" + sheduleDTO.getTime() + "','" + sheduleDTO.getDocid() + "','" + sheduleDTO.getDayid() + "')";
        Statement stm = conn.createStatement();

        return 0 < stm.executeUpdate(sql);
    }

    @Override
    public boolean updateShedule(SheduleDTO sheduleDTO, Connection conn) throws Exception {

        String sql = "Update Shedule set room_no='" + sheduleDTO.getRoom_no() + "',time='" + sheduleDTO.getTime() + "' where docId = '" + sheduleDTO.getDocid() + "' and dayId='" + sheduleDTO.getDayid() + "'";

        Statement stm = conn.createStatement();

        return 0 < stm.executeUpdate(sql);

    }
}
