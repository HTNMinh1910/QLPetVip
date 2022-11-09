package com.example.quanlypetvip.dao;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypetvip.model.BillObj;

import java.util.List;

public interface BillDao {
    @Insert
    void insert(BillObj object);

    @Query("SELECT * FROM Bill")
    List<BillObj> getAllData();

    @Update
    void edit(BillObj object);

    @Query("SELECT * FROM Bill WHERE id = :ID")
    BillObj getById(int ID);
}
