/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.doctor_chaneling_center.dao;

import edu.ijse.doctor_chaneling_center.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface SuperDAO<T extends SuperDTO> {

    public boolean add(T t) throws Exception;

    public boolean update(T t) throws Exception;

    public boolean delete(String key) throws Exception;

    public T search(String key) throws Exception;

    public ArrayList<T> getAll() throws Exception;

}
