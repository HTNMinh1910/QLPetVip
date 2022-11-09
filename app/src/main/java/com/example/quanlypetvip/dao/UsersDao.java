package com.example.quanlypetvip.dao;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypetvip.model.UsersObj;

import java.util.List;

public interface UsersDao {
    @Insert
    void insert(UsersObj object);

    @Query("SELECT * FROM Users")
    List<UsersObj> getAllData();

    @Update
    void edit(UsersObj object);

    @Query("SELECT * FROM Users WHERE id = :ID")
    UsersObj getById(int ID);
}
