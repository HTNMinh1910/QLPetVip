package com.example.quanlypetvip.dao;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlypetvip.model.BookObj;

import java.util.List;

public interface BookDao {
    @Insert
    void insert(BookObj object);

    @Query("SELECT * FROM Book")
    List<BookObj> getAllData();

    @Update
    void edit(BookObj object);

    @Query("SELECT * FROM Book WHERE id = :ID")
    BookObj getById(int ID);
}
