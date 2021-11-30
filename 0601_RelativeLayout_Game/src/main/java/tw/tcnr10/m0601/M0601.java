package tw.tcnr10.m0601;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.InetAddress;

public class M0601 extends AppCompatActivity {

    private TextView txtComPlay, txtSelect,txtResult;
    private Button btnScissors, btnStone, btnNet;
    private String user_select;
    private String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0601);
        setupViewComponent();
    }
    private void setupViewComponent(){

        txtComPlay = (TextView) findViewById(R.id.m0601_c001);
        txtSelect = (TextView) findViewById(R.id.m0601_s001);
        txtResult = (TextView) findViewById(R.id.m0601_f000);
        btnScissors = (TextView) findViewById(R.id.m0601_b001);
        btnStone = (TextView) findViewById(R.id.m0601_b002);
        btnNet = (TextView) findViewById(R.id.m0601_b003);


        btnScissors.setOnClickListener(btn01On);
        btnStone.setOnClickListener(btn01On);
        btnNet.setOnClickListener(btn01On);

    }

    private View.OnClickListener btn01On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int iComPlay = (int) (Math.random()*3+1); // 1 - scissors, 2 - stone, 3 -n.

            switch (v.getId()){
                case R.id.m0601_b001: //選擇剪刀scissors
                    user_select = getString(R.string.m0601_s001)+"   "+getString(R.id.m0601_b001);//"你選擇:"+" "+"剪刀";
                    switch (iComPlay){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            answer = getString(R.id.m0601_f000)+getString(R.id.m0601_f003);//平手
                            break;
                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            answer = getString(R.id.m0601_f000)+getString(R.id.m0601_f002);//輸
                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            answer = getString(R.id.m0601_f000)+getString(R.id.m0601_f001);//贏
                            break;



        }
    }

    }
    txtSelect.setText(user_select);
    txtResult.setText(answer);

}