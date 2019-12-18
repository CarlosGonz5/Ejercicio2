package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button add, getAll, getLast, getName;
    Spinner sweet;
    EditText name, weight, nameAbajo;
    CheckBox rotten;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.btnAdd);
        getAll = (Button) findViewById(R.id.btnGetAll);
        getLast = (Button) findViewById(R.id.btnGetLast);
        getName = (Button) findViewById(R.id.btnGetName);

        sweet = (Spinner) findViewById(R.id.tipos);

        name = (EditText) findViewById(R.id.txtName);
        weight = (EditText) findViewById(R.id.txtWeight);
        nameAbajo = (EditText) findViewById(R.id.txtName2);

        rotten = (CheckBox) findViewById(R.id.rotten);

        ArrayAdapter <CharSequence> tipos = ArrayAdapter.createFromResource(this, R.array.tipos, android.R.layout.simple_spinner_item);
        sweet.setAdapter(tipos);

        final BDHelper helper = new BDHelper(this);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SQLiteDatabase db = helper.getWritableDatabase();

                ContentValues values = new ContentValues();

                values.put(EstructuraBD.NOMBRE_CAMPO2, name.getText().toString());
                values.put(EstructuraBD.NOMBRE_CAMPO3, weight.getText().toString());
                values.put(EstructuraBD.NOMBRE_CAMPO4, sweet.getSelectedItem().toString());

                if(rotten.isChecked()){
                    values.put(EstructuraBD.NOMBRE_CAMPO5, 1);
                } else{
                    values.put(EstructuraBD.NOMBRE_CAMPO5, 0);
                }


                long newRowId = db.insert(EstructuraBD.TABLE_NAME, null, values);
                Toast.makeText(getApplicationContext(), "Se guardo el registro", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
