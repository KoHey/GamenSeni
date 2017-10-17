package com.example.ksugawara.gamenseni;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.textColor;

public class InputActivity extends AppCompatActivity{

    EditText editInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        editInput = (EditText) findViewById(R.id.editInput);

        editInput.addTextChangedListener(new TextWatcher() {
            int currentLength = 0;

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                currentLength = s.toString().length();
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.v("", "after:" + s.toString());
                if (s.toString().length() < currentLength) {
                    return;
                }
                boolean unfixed = false;
                Object[] spanned = s.getSpans(0, s.length(), Object.class);
                if (spanned != null) {
                    for (Object obj : spanned) {
                        if (obj instanceof android.text.style.UnderlineSpan) {
                            unfixed = true;
                        }
                    }
                }
                if (!unfixed) {
                    Toast.makeText(getApplicationContext(), "確定", Toast.LENGTH_SHORT).show();
                    //editInput.setText(s + "-");
                    //editInput.setSelection(editInput.getText().length());
                }

            }
        });


    }


//    @Override
//    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//    }
//
//    @Override
//    public void onTextChanged(CharSequence s, int start, int before, int count) {
//        int txtLength = s.length();
//        textCount.setText(Integer.toString(txtLength) + "/30");
//        if (txtLength == 5) {
//            editInput.setText(editInput.getText() + "-");
//            editInput.setSelection(editInput.getText().length());
//        }
//    }
//
//    @Override
//    public void afterTextChanged(Editable s) {
////        // 入力文字数の表示
////        int txtLength = s.length();
////        textCount.setText(Integer.toString(txtLength) + "/30");
////
////        // 指定文字数オーバーで文字色を赤くする
////        if (txtLength == 5) {
////            editInput.setText(editInput.getText() + "-");
////            editInput.setSelection(editInput.getText().length());
////        }
//    }
//    public void setText(){
//        editInput.setText(editInput.getText() + "-");
//    }

}
