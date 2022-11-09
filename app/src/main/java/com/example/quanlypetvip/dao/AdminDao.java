package com.example.quanlypetvip.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypetvip.model.AdminObj;

import java.util.List;
@Dao
public interface AdminDao {
    @Insert
    void insert(AdminObj object);

    @Query("SELECT * FROM Admin")
    List<AdminObj> getAllData();

    @Update
    void edit(AdminObj object);

    @Query("SELECT * FROM Admin WHERE id = :ID")
    AdminObj getById(int ID);
}
