package com.example.moodtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    //DB name
    public static final String DATABASE_NAME = "MoodDB.db";
    public static final int DATABASE_VERSION = 1;

    //Table name
    public static final String  TABLE_NAME = "mood_entry";
    //Columns
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_MOOD = "_mood";
    public static final String COLUMN_TIME = "_time";
    public static final String COLUMN_DATE = "_date";
    public static final String COLUMN_DESCRIPTION = "_description";

    //The constructor
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        String query = "CREATE TABLE " + TABLE_NAME +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                COLUMN_MOOD + " TEXT, " +
                COLUMN_DESCRIPTION + " MEDIUMTEXT, " +
                COLUMN_DATE + " DATE, " +
                COLUMN_TIME + " TIMESTAMP );";

        DB.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(DB);
    }

    private String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }

    // queries for interacting
    public void addMood(String mood, String description){
        //getting the the getWritableDatabe to write to the table
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        // the parameters that we wish toa dd
        cv.put(COLUMN_MOOD, mood);
        cv.put(COLUMN_DESCRIPTION, description);
        cv.put(COLUMN_DATE, getDate());
        cv.put(COLUMN_TIME, getTime());


        // Will hold the result of the insertion
        long result = db.insert(TABLE_NAME, null, cv);

        if (result != -1) {
            System.out.println("added");
            System.out.println(getDate() + " "+ getTime());
        }
        // Will notify the user if the new submission was successful
//        if(result == -1){
//            Toast.makeText(context, "DB Update Failed", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(context, "DB Update Success", Toast.LENGTH_SHORT).show();
//        }



    }
}
