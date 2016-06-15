package com.example.camcuz97.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String oldText = getIntent().getStringExtra("text");
        etEditItem = (EditText) findViewById(R.id.newTextItem);
        etEditItem.setText(oldText);
    }
    public void editClick(View v){
        String newText = etEditItem.getText().toString();
        int pos = getIntent().getIntExtra("position",0);
        Intent data = new Intent();
        data.putExtra("editText", newText);
        data.putExtra("position", pos);
        setResult(RESULT_OK, data);
        finish();
    }
}
