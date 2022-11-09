package com.example.quanlypetvip.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.quanlypetvip.dao.BillDao;
import com.example.quanlypetvip.model.BillObj;

@Database(entities = {BillObj.class},version = 1)
public abstract class BillDB extends RoomDatabase {
    public abstract BillDao Dao();
    public static final String DATABASENAME="Bill.db";
    public static BillDB Instance;
    public static synchronized BillDB getInstance(Context context){
        if(Instance ==null){
            Instance = Room.databaseBuilder(context,BillDB.class,DATABASENAME).
                    allowMainThreadQueries().build();
        }
        return Instance;
    }
}