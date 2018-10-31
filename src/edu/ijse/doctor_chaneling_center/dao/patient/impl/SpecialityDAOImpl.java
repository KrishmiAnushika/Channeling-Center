/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.dao.patient.SpecialityDAO;
import edu.ijse.doctor_chaneling_center.db.ConnectionFactory;
import edu.ijse.doctor_chaneling_center.dto.SpecialityDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SpecialityDAOImpl implements SpecialityDAO {

    private Connection connection;

    public SpecialityDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SpecialityDTO t) throws Exception {
        String sql = "INSERT INTO Speciality VALUES (?,?)";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, t.getSpeid());
        pstm.setString(2, t.getSpename());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean update(SpecialityDTO t) throws Exception {
        String sql = "UPDATE Speciality SET spename=? WHERE speid =?";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, t.getSpeid());
        pstm.setString(2, t.getSpename());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Speciality WHERE speid ='" + key + "'";

        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public SpecialityDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Speciality WHERE speid = '" + key + "'";

        SpecialityDTO specialityDTO = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            specialityDTO = new SpecialityDTO(rst.getString(1), rst.getString(2));

        }

        return specialityDTO;
    }

    @Override
    public ArrayList<SpecialityDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Speciality";
        ArrayList<SpecialityDTO> allSpecialitys = new ArrayList<>();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            SpecialityDTO specialityDTO = new SpecialityDTO(rst.getString(1), rst.getString(2));
            allSpecialitys.add(specialityDTO);
        }
        return allSpecialitys;
    }

    @Override
    public SpecialityDTO searchByName(String name) throws Exception {
        String sql = "SELECT * FROM Speciality WHERE spename = '" + name + "'";

        SpecialityDTO specialityDTO = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            specialityDTO = new SpecialityDTO(rst.getString(1), rst.getString(2));

        }

        return specialityDTO;
    }
}
