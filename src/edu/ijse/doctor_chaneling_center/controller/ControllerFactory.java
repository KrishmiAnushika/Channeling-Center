/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.controller;

import edu.ijse.doctor_chaneling_center.controller.custom.impl.AppointmentControllerImpl;
import edu.ijse.doctor_chaneling_center.controller.custom.impl.DayControllerImpl;
import edu.ijse.doctor_chaneling_center.controller.custom.impl.DoctorControllerImpl;
import edu.ijse.doctor_chaneling_center.controller.custom.impl.PatientControllerImpl;
import edu.ijse.doctor_chaneling_center.controller.custom.impl.PaymentControllerImpl;
import edu.ijse.doctor_chaneling_center.controller.custom.impl.SheduleControllerImpl;
import edu.ijse.doctor_chaneling_center.controller.custom.impl.SpecialityControllerImpl;

/**
 *
 * @author USER
 */
public class ControllerFactory {
    public enum ControllerTypes{
        SPECIALITY, DOCTOR, DAY, SHEDULE, PATIENT, PAYMENT, APPOINTMENT;
    }
    
    private static ControllerFactory ctrlFactory;
    
    private ControllerFactory(){
        
    }
    
    public static ControllerFactory getInstance(){
        if (ctrlFactory == null){
            ctrlFactory = new ControllerFactory();
        }
        return ctrlFactory;
    }
    
    public SuperController getController(ControllerTypes controllerTypes) {
        switch (controllerTypes){
            case SPECIALITY:
                return new SpecialityControllerImpl();
            case DOCTOR:
                return new DoctorControllerImpl();
            case DAY:
                return new DayControllerImpl();
            case SHEDULE:
                return new SheduleControllerImpl();
            case PATIENT:
                return new PatientControllerImpl();
            case PAYMENT:
                return new PaymentControllerImpl();
            case APPOINTMENT:
                return new AppointmentControllerImpl();
            default:
                return null;
        }
    }
}
