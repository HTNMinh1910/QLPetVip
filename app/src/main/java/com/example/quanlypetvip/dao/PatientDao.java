package com.example.quanlypetvip.dao;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypetvip.model.PatientObj;

import java.util.List;

public interface PatientDao {
    @Insert
    void insert(PatientObj object);

    @Query("SELECT * FROM Patient")
    List<PatientObj> getAllData();

    @Update
    void edit(PatientObj object);

    @Query("SELECT * FROM Patient WHERE id = :ID")
    PatientObj getById(int ID);
}
