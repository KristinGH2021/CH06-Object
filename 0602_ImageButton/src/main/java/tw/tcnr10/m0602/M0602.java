package tw.tcnr10.m0602;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0602 extends AppCompatActivity {

    private TextView txtSelect, txtResult;
   // private Button btnScissors, btnStone, btnNet;
    private String user_select;
    private String answer;
    private ImageButton btnScissors;
    private ImageButton btnStone;
    private ImageButton btnNet;
    private ImageView txtComPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0602);
        setupViewComponent();
    }

    private void setupViewComponent() {

        txtComPlay = (ImageView) findViewById(R.id.m0602_c001);
        txtSelect = (TextView) findViewById(R.id.m0602_s001);
        txtResult = (TextView) findViewById(R.id.m0602_f000);
        btnScissors = (ImageButton) findViewById(R.id.m0602_b001);
        btnStone = (ImageButton) findViewById(R.id.m0602_b002);
        btnNet = (ImageButton) findViewById(R.id.m0602_b003);


        btnScissors.setOnClickListener(btn01On);
        btnStone.setOnClickListener(btn01On);
        btnNet.setOnClickListener(btn01On);

    }

    private View.OnClickListener btn01On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int iComPlay = (int) (Math.random() * 3 + 1); // 1 - scissors, 2 - stone, 3 -n.

            switch (v.getId()) {
                case R.id.m0602_b001: //選擇剪刀scissors
                    user_select = getString(R.string.m0602_s001) + "   " + getString(R.string.m0602_b001);//"你選擇:"+" "+"剪刀";
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f003);//平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f002);//輸
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f001);//贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                    }
                    break;
                case R.id.m0602_b002: //選擇石頭STONE
                    user_select = getString(R.string.m0602_s001) + "   " + getString(R.string.m0602_b002);//"你選擇:"+" "+"石頭;
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f001);//贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f003);//平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f002);//輸
                            txtResult.setTextColor(Color.RED);
                            break;
                    }
                    break;
                case R.id.m0602_b003: //選擇布 Net
                    user_select = getString(R.string.m0602_s001) + "   " + getString(R.string.m0602_b003);//"你選擇:"+" "+"布";
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f002);//輸
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f001);//贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer = getString(R.string.m0602_f000) + getString(R.string.m0602_f003);//平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                    }
                    break;


            }
            txtSelect.setText(user_select);
            txtResult.setText(answer);
        }


    };
}