package com.example.yxl.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yxl on 16/9/9.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * Province建表   省名  省级代号
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";
    /**
     * City建表  城市名  市级代号  City表关联Province表的外键
     */
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";
    /**
     * County建表 县名  县级代号 County表关联City表的外键
     */
    public static final String CREATE_COUNTY = "create table County("
            + "id integer primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name,
                                 SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_PROVINCE);
        sqLiteDatabase.execSQL(CREATE_CITY);
        sqLiteDatabase.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
