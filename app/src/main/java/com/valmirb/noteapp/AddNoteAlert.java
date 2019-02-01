package com.valmirb.noteapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class AddNoteAlert extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    private EditText editTextTitle;
    private EditText editTextDescription;

    public AddNoteAlert(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_add_note);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.btn_yes:
//                c.finish();
//                break;
//            case R.id.btn_no:
//                dismiss();
//                break;
            default:
                break;
        }
        dismiss();
    }
}