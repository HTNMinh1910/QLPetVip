package com.example.quanlypetvip.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.quanlypetvip.dao.BookDao;
import com.example.quanlypetvip.model.BookObj;

@Database(entities = {BookObj.class},version = 1)
public abstract class BookDB extends RoomDatabase {
    public abstract BookDao Dao();
    public static final String DATABASENAME="Book.db";
    public static BookDB Instance;
    public static synchronized BookDB getInstance(Context context){
        if(Instance ==null){
            Instance = Room.databaseBuilder(context,BookDB.class,DATABASENAME).
                    allowMainThreadQueries().build();
        }
        return Instance;
    }
}