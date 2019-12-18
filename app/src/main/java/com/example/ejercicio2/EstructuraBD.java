package com.example.ejercicio2;

public class EstructuraBD {

    public static final String TABLE_NAME = "fruitis";
    public static final String NOMBRE_CAMPO1 = "id";
    public static final String NOMBRE_CAMPO2 = "name";
    public static final String NOMBRE_CAMPO3 = "weight";
    public static final String NOMBRE_CAMPO4 = "type";
    public static final String NOMBRE_CAMPO5 = "rotten";

    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + EstructuraBD.TABLE_NAME + " ("+
            EstructuraBD.NOMBRE_CAMPO1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            EstructuraBD.NOMBRE_CAMPO2 + " TEXT, " +
            EstructuraBD.NOMBRE_CAMPO3 + " INTEGER, " +
            EstructuraBD.NOMBRE_CAMPO4 + " TEXT, " +
            EstructuraBD.NOMBRE_CAMPO5 + " BOOLEAN)";

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + EstructuraBD.TABLE_NAME;

}
