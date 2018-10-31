/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao;

import edu.ijse.doctor_chaneling_center.dao.patient.impl.AppointmentDAOImpl;
import edu.ijse.doctor_chaneling_center.dao.patient.impl.DayDAOImpl;
import edu.ijse.doctor_chaneling_center.dao.patient.impl.DoctorDAOImpl;
import edu.ijse.doctor_chaneling_center.dao.patient.impl.PatientDAOImpl;
import edu.ijse.doctor_chaneling_center.dao.patient.impl.PaymentDAOImpl;
import edu.ijse.doctor_chaneling_center.dao.patient.impl.SheduleDAOImpl;
import edu.ijse.doctor_chaneling_center.dao.patient.impl.SpecialityDAOImpl;

/**
 *
 * @author USER
 */
public class DAOFactory {
    public enum DAOTypes{
        SPECIALITY, DOCTOR, DAY, SHEDULE, PATIENT, PAYMENT, APPOINTMENT;
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType) {
        switch(daoType){
            case SPECIALITY:
                return new SpecialityDAOImpl();
            case DOCTOR:
                return new DoctorDAOImpl();
            case DAY:
                return new DayDAOImpl();
            case SHEDULE:
                return new SheduleDAOImpl();
            case PATIENT:
                return new PatientDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            case APPOINTMENT:
                return new AppointmentDAOImpl();
            default:
                return null;
        }
    }
}
