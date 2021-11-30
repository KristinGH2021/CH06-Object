package tw.tcnr10.m0607;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class M0500 extends AppCompatActivity {

    //    private EditText e001;
    private Button b001;
    private TextView t003;
    private EditText e001;
    private String ans;
    private DecimalFormat pondsFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupviewcomponent();/**自定義配置*/
    }

    private void setupviewcomponent() {/**定義配置碼.*/

        Intent intent = this.getIntent();// M0500
        String mode_title = intent.getStringExtra("class_title");
        this.setTitle(mode_title);

        e001 = (EditText) findViewById(R.id.m0500_e001);//定義變數單位:公斤(KG).磅(lb)
        b001 = (Button) findViewById(R.id.m0500_b001);//定義按鈕變數Button
        t003 = (TextView) findViewById(R.id.m0500_t003);//定義結果變數數值
        b001.setOnClickListener(B001on);
    }


    private View.OnClickListener B001on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pondsFormat = new DecimalFormat("0.00000");
            //----------------------------------------------
            if (e001.getText().toString().length() > 0) {
                ans = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 2.20462262);
            } else {
                ans = "";
            }
            //-----------------------------------------------
            t003.setText(ans);
        }
    };
}