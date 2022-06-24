package com.example.inventory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;



/*
This page, on create needs to fill up the editText with date in format MMM. DD
Save button needs to create a local
 */
public class CreateNotes extends AppCompatActivity {

    public static final String NOTES_THREAD = "NotesThread";
    private EditText editNotesName;
    private Button btnSaveCreate;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createnotes);
        editNotesName = findViewById(R.id.edittext_Notes);
        btnSaveCreate = findViewById(R.id.btn_save_created);

        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DATE);
        int month = c.get(Calendar.MONTH);
        String monthString="Date";
        if(month == 0)
            monthString="Jan. ";
        else if(month == 1)
            monthString = "Feb. ";
        else if(month == 2)
            monthString = "Mar. ";
        else if(month == 3)
            monthString = "Apr. ";
        else if(month == 4)
            monthString = "May ";
        else if(month == 5)
            monthString = "Jun. ";
        else if(month == 6)
            monthString = "Jul. ";
        else if(month == 7)
            monthString = "Aug. ";
        else if(month == 8)
            monthString = "Sep. ";
        else if(month == 9)
            monthString = "Oct. ";
        else if(month == 10)
            monthString = "Nov. ";
        else if(month == 11)
            monthString = "Dec. ";
        editNotesName.setText(monthString+day);

    }
}
