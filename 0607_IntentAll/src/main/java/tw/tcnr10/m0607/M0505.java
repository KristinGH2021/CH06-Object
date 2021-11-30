package tw.tcnr10.m0607;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class M0505 extends AppCompatActivity {

    //===========宣告變數============
    private Button btnAddAutoCompleteText,
            btnClrAutoCompleteText;

    private AutoCompleteTextView autoCompleteTextView;
    private ArrayAdapter<String> adapAutoCompText;

    //==============================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0505);
        setupViewCompoent();
    }

    private void setupViewCompoent() {

        Intent intent = M0505.this.getIntent();
        String mode_title = intent.getStringExtra("class_title");
        this.setTitle(mode_title);

        //從資源類別R中取得介面元件
        btnAddAutoCompleteText = (Button) findViewById(R.id.m0505_b001);
        btnClrAutoCompleteText = (Button) findViewById(R.id.m0505_b002);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.m0505_a001);

        adapAutoCompText = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line);

        autoCompleteTextView.setAdapter(adapAutoCompText);
        //---宣告傾聽---
        btnAddAutoCompleteText.setOnClickListener(btnAddAutoCompleteTextOn); //加入自動完成文字
        btnClrAutoCompleteText.setOnClickListener(btnClrAutoCompleteTextOn); //清除自動完成文字

    }

    //------加入自動完成文字事件------
    private View.OnClickListener btnAddAutoCompleteTextOn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = autoCompleteTextView.getText().toString();
            adapAutoCompText.add(s);
            autoCompleteTextView.setText("");
        }

    };




    //-----清除自動完成文字事件------
    private  View.OnClickListener btnClrAutoCompleteTextOn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            adapAutoCompText.clear();

        }
    };
    //----------------------------------------------------

}


