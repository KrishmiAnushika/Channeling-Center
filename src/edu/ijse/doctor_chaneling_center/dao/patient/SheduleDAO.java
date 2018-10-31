/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao.patient;

import edu.ijse.doctor_chaneling_center.dao.SuperDAO;
import edu.ijse.doctor_chaneling_center.dto.SheduleDTO;
import java.sql.Connection;

/**
 *
 * @author USER
 */
public interface SheduleDAO extends SuperDAO<SheduleDTO> {
    public boolean addShedule(SheduleDTO sheduleDTO,Connection conn)throws Exception;
    public boolean updateShedule(SheduleDTO sheduleDTO,Connection conn)throws Exception;
}
