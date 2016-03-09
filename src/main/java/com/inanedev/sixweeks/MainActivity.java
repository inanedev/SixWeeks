package com.inanedev.sixweeks;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView appPath = (TextView) findViewById(R.id.quickTips);
        Button bStart = (Button) findViewById(R.id.startTraining_button);
        bStart.setOnClickListener(this);

        //appPath.setText(this.getDatabasePath("SixWeeks.db3").toString());

                //.getFilesDir().getPath()

        DataBaseHelper myDbHelper = new DataBaseHelper(this);
        try {
            System.out.println("Form OnCreate -> createDatabase");
            myDbHelper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        appPath.setText(myDbHelper.getDatabaseName());


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.startTraining_button) {

        }
/*        TextView appPath = (TextView) findViewById(R.id.quickTips);

        DataBaseHelper myDbHelper = new DataBaseHelper(this);

        try {
            myDbHelper.openDataBase();
            System.out.println("onClick -> OpenDatabase");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (v.getId() == R.id.startTraining_button) {
            appPath.setText("hoho");

            Cursor mCursor = myDbHelper.getTrainings("PushUp", 1, 2, 3);

            if (mCursor.moveToFirst()){
                do{
                    String data = mCursor.getString(mCursor.getColumnIndex("t4"));
                    appPath.setText(data);
                    // do what ever you want here
                }while(mCursor.moveToNext());
            }
            mCursor.close();


        }*/

    }
}
