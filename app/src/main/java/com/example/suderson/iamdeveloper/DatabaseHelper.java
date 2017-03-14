package com.example.suderson.iamdeveloper;

import android.content.ContentValues;
import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by suderson on 1/7/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "seats.db";
    public static final String TABLE_NAME = "bookeddetails";
    public static final String COL_1 = "Name";
    public static final String COL_2= "EmployeeId";
    public static final String COL_3 = "EmailId";
    public static final String COL_4 = "SelectTiming";
    public static final String COL_5 = "fromdate";
    public static final String COL_6 = "todate";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (Name TEXT,EmployeeID INTEGER PRIMARY KEY AUTOINCREMENT,EmailId TEXT,SelectTiming TEXT,fromdate REAL,todate REAL) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String Name, String EmployeeId, String EmailId,String SelectTiming, String fromdate, String todate){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,Name);
        contentValues.put(COL_2,EmployeeId);
        contentValues.put(COL_3,EmailId);
        contentValues.put(COL_4,SelectTiming);
        contentValues.put(COL_5,fromdate);
        contentValues.put(COL_6,todate);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;


    }


}