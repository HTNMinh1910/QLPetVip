package com.example.quanlypetvip.dao;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypetvip.model.AnimalObj;

import java.util.List;

public interface AnimalDao {
    @Insert
    void insert(AnimalObj object);

    @Query("SELECT * FROM Animal")
    List<AnimalObj> getAllData();

    @Update
    void edit(AnimalObj object);

    @Query("SELECT * FROM Animal WHERE id = :ID")
    AnimalObj getById(int ID);
}
