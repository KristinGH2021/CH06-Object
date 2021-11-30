package tw.tcnr10.m0607;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class M0501 extends AppCompatActivity {


    private Spinner s001;
    private EditText e001;
    private Button b001;
    private TextView ans01;
    private String sSex;
    private String strSug;
//    private TextView e001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0501);
        setupviewcomponent();/**自定義配置*/
    }

    private void setupviewcomponent() {

        Intent intent = M0501.this.getIntent();
        String mode_title = intent.getStringExtra("class_title");
        this.setTitle(mode_title);


        s001 = (Spinner) findViewById(R.id.m0501_s001);
        e001 = (EditText) findViewById(R.id.m0501_e001);
//        e001=(TextView)findViewById(R.id.m0501_e001);
        b001 = (Button) findViewById(R.id.m0501_b001);
        ans01 = (TextView) findViewById(R.id.m0501_f000);

        // 設定 spinner item 選項------------
        //使用系統格式,字體無法改變
//    ArrayAdapter<CharSequence> adapSexList = ArrayAdapter
//            .createFromResource(this, R.array.m0501_a001,
//                    android.R.layout.simple_spinner_item);
//        adapSexList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        s001.setAdapter(adapSexList);
//---------------------------------------simple_spinner_dropdown_item
        //使用系統格式,字體可以改變
        ArrayAdapter<CharSequence> adapSexList =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.m0501_a001,
                        R.layout.spinner_item);
        s001.setAdapter(adapSexList);
//---------------------------------------
//        ArrayAdapter<CharSequence> adapterSexList=
//                ArrayAdapter.createFromResource(
//                        this,
//                        R.array.m0501_a001, //陣列選取,創造選取源,選取源內容:
//                        R.layout.support_simple_spinner_dropdown_item);
//        s001.setAdapter(adapterSexList);

        s001.setOnItemSelectedListener(S001on);
        b001.setOnClickListener(B001on);


    }


    private AdapterView.OnItemSelectedListener S001on = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            sSex = parent.getSelectedItem().toString();

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };


    private View.OnClickListener B001on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String strsug = getString(R.string.m0501_f000);//輸出串接結果


//-------------------------------------
//   檢查年齡是否輸入
            if (e001.getText().toString().length() > 0) {
                int iAge = Integer.parseInt(e001.getText().toString());

                if (sSex.equals(getString(R.string.chk01))) {
                    //------男生-------
                    //判斷年齡開始
                    if (iAge < 28) {
                        strsug += getString(R.string.m0501_f001);
                    } else if (iAge > 33) {
                        strsug = getString(R.string.m0501_f002);
                    } else {
                        strsug = getString(R.string.m0501_f003);
                    }
                    //判斷年齡結束

                } else {
                    // ------女生------
                    //判斷年齡開始
                    if (iAge < 25) {
                        strsug += getString(R.string.m0501_f001);
                    } else if (iAge > 30) {
                        strsug = getString(R.string.m0501_f002);
                    } else {
                        strsug = getString(R.string.m0501_f003);
                    }
                    //判斷年齡結束

                }


            } else {
                strSug = getString(R.string.nospace);

            }
            ans01.setText(strsug);


            //-------------------------------------

        }
    };

}