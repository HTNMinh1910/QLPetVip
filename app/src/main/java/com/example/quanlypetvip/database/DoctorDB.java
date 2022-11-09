package com.example.quanlypetvip.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.quanlypetvip.dao.DoctorDao;
import com.example.quanlypetvip.model.DoctorObj;

@Database(entities = {DoctorObj.class},version = 1)
public abstract class DoctorDB extends RoomDatabase {
    public abstract DoctorDao Dao();
    public static final String DATABASENAME="Doctor.db";
    public static DoctorDB Instance;
    public static synchronized DoctorDB getInstance(Context context){
        if(Instance ==null){
            Instance = Room.databaseBuilder(context, DoctorDB.class,DATABASENAME).
                    allowMainThreadQueries().build();
        }
        return Instance;
    }
}