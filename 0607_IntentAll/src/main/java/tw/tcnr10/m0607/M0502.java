package tw.tcnr10.m0607;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class M0502 extends AppCompatActivity {


    private Spinner s001;
    private EditText e001;
    private Button b001;
    private TextView ans01;
    private String sSex;
    private String strSug;
    private RadioGroup rb01;
    private RadioGroup rb02;
    private RadioButton rb021;
    private RadioButton rb022;
    private RadioButton rb023;


//    private TextView e001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0502);
        setupViewComponent();

        //setupviewcomponent();/**自定義配置*/
    }

    private void setupViewComponent() {

        Intent intent = M0502.this.getIntent();
        String mode_title = intent.getStringExtra("class_title");
        this.setTitle(mode_title);

        b001 = (Button) findViewById(R.id.m0502_b001);
        ans01 = (TextView) findViewById(R.id.m0502_f000);

        rb01 = (RadioGroup) findViewById(R.id.m0502_r001);
        rb02 = (RadioGroup) findViewById(R.id.m0502_r002);
        rb021 = (RadioButton) findViewById(R.id.m0502_r002a);
        rb022 = (RadioButton) findViewById(R.id.m0502_r002b);
        rb023 = (RadioButton) findViewById(R.id.m0502_r002c);
        //設定義
        //設監聽
        rb01.setOnCheckedChangeListener(RB001ON);
         b001.setOnClickListener(B001on);
    }

    private RadioGroup.OnCheckedChangeListener RB001ON = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedIdX) {
            switch (checkedIdX) {
                case R.id.m0502_r001a: //點男
                    rb021.setText(R.string.m0502_r002aa);
                    rb022.setText(R.string.m0502_r002ab);
                    rb023.setText(R.string.m0502_r002ac);
                    break;
                case R.id.m0502_r001b:
                    rb021.setText(R.string.m0502_r002ba);
                    rb022.setText(R.string.m0502_r002bb);
                    rb023.setText(R.string.m0502_r002bc);
                    break;

            }

        }
    };

    private View.OnClickListener B001on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           String strSug=getString(R.string.m0502_f000);
           int ichksex=rb01.getCheckedRadioButtonId();
            switch (ichksex){
                case R.id.m0502_r001a:  //男生
                    switch (rb02.getCheckedRadioButtonId()){
                        case R.id.m0502_r002a:
                            strSug+=getString(R.string.m0502_f001);
                            break;
                        case R.id.m0502_r002b:
                            strSug+=getString(R.string.m0502_f002);
                            break;
                        case R.id.m0502_r002c:
                            strSug+=getString(R.string.m0502_f003);
                            break;
                    }
                    break;
//                ---------------------------------
                case R.id.m0502_r001b:  //女生
                    switch (rb02.getCheckedRadioButtonId()){
                        case R.id.m0502_r002a:
                            strSug+=getString(R.string.m0502_f004);
                            break;
                        case R.id.m0502_r002b:
                            strSug+=getString(R.string.m0502_f005);
                            break;
                        case R.id.m0502_r002c:
                            strSug+=getString(R.string.m0502_f006);
                            break;
                    }
                    break;
            }
            ans01.setText(strSug);
        }
    };
}