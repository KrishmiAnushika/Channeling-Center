/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient.impl;

import edu.ijse.doctor_chaneling_center.controller.ControllerFactory;
import edu.ijse.doctor_chaneling_center.controller.custom.SheduleController;
import edu.ijse.doctor_chaneling_center.dao.patient.DoctorDAO;
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
public class DoctorDAOImpl implements DoctorDAO {

    private Connection connection;
    SheduleController sheduleController;

    public DoctorDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
        sheduleController = (SheduleController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.SHEDULE);
    }

    @Override
    public boolean add(DoctorDTO t) throws Exception {
        String sql = "INSERT INTO Doctor VALUES (?,?,?,?,?,?,?,?,?,?);";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, t.getDocid());
        pstm.setString(2, t.getDocName());
        pstm.setString(3, t.getDocAddress());
        pstm.setInt(4, t.getDocTele());
        pstm.setString(5, t.getHospital());
        pstm.setInt(6, t.gethTele());
        pstm.setString(7, t.getGender());
        pstm.setInt(8, t.getPatientLimit());
        pstm.setDouble(9, t.getDocCharge());
        pstm.setString(10, t.getSpecialityId());

        int result = pstm.executeUpdate();

        return (result > 0);

    }

    @Override
    public boolean update(DoctorDTO t) throws Exception {
        String sql = "UPDATE Doctor SET docname=?, docaddress=?,doctele=?, hospital=?, h_tele=?, gender=?, patientlimit=?, docCharge=?, speid=? WHERE docid =?";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        
        pstm.setString(1, t.getDocName());
        pstm.setString(2, t.getDocAddress());
        pstm.setInt(3, t.getDocTele());
        pstm.setString(4, t.getHospital());
        pstm.setInt(5, t.gethTele());
        pstm.setString(6, t.getGender());
        pstm.setInt(7, t.getPatientLimit());
        pstm.setDouble(8, t.getDocCharge());
        pstm.setString(9, t.getSpecialityId());
        pstm.setString(10, t.getDocid());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Doctor WHERE docid ='" + key + "'";

        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public DoctorDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Doctor WHERE docid = '" + key + "'";

        DoctorDTO doctorDTO = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            doctorDTO = new DoctorDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4),
                    rst.getString(5), rst.getInt(6), rst.getString(7), rst.getInt(8), rst.getDouble(9), rst.getString(10));

        }

        return doctorDTO;
    }

    @Override
    public ArrayList<DoctorDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Doctor";

        ArrayList<DoctorDTO> alDoctor = new ArrayList<>();

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            DoctorDTO doctorDTO = new DoctorDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4),
                    rst.getString(5), rst.getInt(6), rst.getString(7), rst.getInt(8), rst.getDouble(9), rst.getString(10));

            alDoctor.add(doctorDTO);
        }
        return alDoctor;

    }

    @Override
    public boolean addDoctor(DoctorDTO doctorDTO, ArrayList<SheduleDTO> sheduleList) throws Exception {
        String sql = "INSERT INTO Doctor VALUES (?,?,?,?,?,?,?,?,?,?);";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, doctorDTO.getDocid());
        pstm.setString(2, doctorDTO.getDocName());
        pstm.setString(3, doctorDTO.getDocAddress());
        pstm.setInt(4, doctorDTO.getDocTele());
        pstm.setString(5, doctorDTO.getHospital());
        pstm.setInt(6, doctorDTO.gethTele());
        pstm.setString(7, doctorDTO.getGender());
        pstm.setInt(8, doctorDTO.getPatientLimit());
        pstm.setDouble(9, doctorDTO.getDocCharge());
        pstm.setString(10, doctorDTO.getSpecialityId());

        connection.setAutoCommit(false);
        
        boolean result = 0<pstm.executeUpdate();
        
        int addedCount = 0;
        if(result){
            for (SheduleDTO sheduleList1 : sheduleList) {
                boolean addShedule = sheduleController.addShedule(sheduleList1, connection);
                if(addShedule){
                    addedCount ++;
                }
            }
            if(addedCount == sheduleList.size()){
                connection.commit();
                return true;
            }else{
                connection.rollback();
                return false;
            }
        }else{
            connection.rollback();
            return false;
        }
    }

    @Override
    public boolean updateDoctor(DoctorDTO doctorDTO, ArrayList<SheduleDTO> sheduleList) throws Exception {
        String sql = "Update Doctor set docname=?, docaddress=?,doctele=?, hospital=?, h_tele=?, gender=?, patientlimit=?, docCharge=?, speid=? WHERE docid =?;";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        
        pstm.setString(1, doctorDTO.getDocName());
        pstm.setString(2, doctorDTO.getDocAddress());
        pstm.setInt(3, doctorDTO.getDocTele());
        pstm.setString(4, doctorDTO.getHospital());
        pstm.setInt(5, doctorDTO.gethTele());
        pstm.setString(6, doctorDTO.getGender());
        pstm.setInt(7, doctorDTO.getPatientLimit());
        pstm.setDouble(8, doctorDTO.getDocCharge());
        pstm.setString(9, doctorDTO.getSpecialityId());
        pstm.setString(10, doctorDTO.getDocid());

        connection.setAutoCommit(false);
        
        boolean result = 0<pstm.executeUpdate();
        
        int addedCount = 0;
        if(result){
            for (SheduleDTO sheduleList1 : sheduleList) {
                boolean updateShedule = sheduleController.updateShedule(sheduleList1, connection);
                if(updateShedule){
                    addedCount ++;
                }
            }
            if(addedCount == sheduleList.size()){
                connection.commit();
                return true;
            }else{
                connection.rollback();
                return false;
            }
        }else{
            connection.rollback();
            return false;
        }
    }

    @Override
    public boolean updatePatientCount(String docId, int patientCount) throws Exception {
        String sql = "UPDATE Doctor SET patientlimit='"+patientCount+"' WHERE docid ='"+docId+"'";

        java.sql.PreparedStatement pstm = connection.prepareStatement(sql);

        
        

        int result = pstm.executeUpdate();

        return (result > 0);
    }

}
