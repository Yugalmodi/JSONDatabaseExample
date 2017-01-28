package com.techpalle.jsondatabaseexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by DELL on 25-Jan-17.
 */
public class MyDatabase {
    private MyHelper myHelper;
    private  SQLiteDatabase sqLiteDatabase;

    public  MyDatabase(Context c){
        myHelper = new MyHelper(c, "techpalle.db", null, 1);
    }
    public void open(){
       sqLiteDatabase = myHelper.getWritableDatabase();
    }
    public void close(){
        sqLiteDatabase.close();
    }

    public void insert(String name, String email, String mobile){
        ContentValues cv = new ContentValues();
        cv.put("name", name);
        cv.put("email", email);
        cv.put("mobile", mobile);
        sqLiteDatabase.insert("contacts", null, cv);
    }

    public Cursor queryContact(){
        Cursor c= null;
        c = sqLiteDatabase.query("contacts", null, null, null, null, null, null);
        return c;
    }

    public class MyHelper extends SQLiteOpenHelper{
        public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);

        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("create table contacts(_id integer primary key, name text, email text, mobile text);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }

}
