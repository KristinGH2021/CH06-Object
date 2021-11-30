package tw.tcnr10.m0603;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0603 extends AppCompatActivity {

    private TextView txtSelect, txtResult;
   // private Button btnScissors, btnStone, btnNet;
    private String user_select;
    private String answer;
    private ImageButton btnScissors;
    private ImageButton btnStone;
    private ImageButton btnNet;
    private ImageView txtComPlay;

    private MediaPlayer startmusic;
    private MediaPlayer mediaWin;
    private MediaPlayer mediaLose;
    private MediaPlayer mediaDraw;
    private MediaPlayer mediaend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0603);
        setupViewComponent();
    }

    private void setupViewComponent() {

        txtComPlay = findViewById(R.id.m0603_c001);
        txtSelect = findViewById(R.id.m0603_s001);
        txtResult = findViewById(R.id.m0603_f000);
        btnScissors = findViewById(R.id.m0603_b001);
        btnStone = findViewById(R.id.m0603_b002);
        btnNet = findViewById(R.id.m0603_b003);
// --開啟片頭音樂-----
        //  startmusic = MediaPlayer.create(getApplication(), R.raw.guess);
        //  startmusic.start();
        startmusic=MediaPlayer.create(getApplication(),R.raw.guess);
        startmusic.start();
    //
        mediaWin=MediaPlayer.create(getApplication(),R.raw.vctory);
        mediaLose=MediaPlayer.create(getApplication(),R.raw.lose);
        mediaDraw=MediaPlayer.create(getApplication(),R.raw.haha);
        mediaend=MediaPlayer.create(getApplication(),R.raw.yt1s);

    //
        btnScissors.setOnClickListener(btn01On);
        btnStone.setOnClickListener(btn01On);
        btnNet.setOnClickListener(btn01On);



    }


    private final View.OnClickListener btn01On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int iComPlay = (int) (Math.random() * 3 + 1); // 1 - scissors, 2 - stone, 3 -n.

            switch (v.getId()) {
                case R.id.m0603_b001: //選擇剪刀scissors
                    user_select = getString(R.string.m0603_s001) + "   " + getString(R.string.m0603_b001);//"你選擇:"+" "+"剪刀";
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f003);//平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f002);//輸
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f001);//贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                    }
                    break;
                case R.id.m0603_b002: //選擇石頭STONE
                    user_select = getString(R.string.m0603_s001) + "   " + getString(R.string.m0603_b002);//"你選擇:"+" "+"石頭;
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f001);//贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f003);//平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f002);//輸
                            txtResult.setTextColor(Color.RED);
                            break;
                    }
                    break;
                case R.id.m0603_b003: //選擇布 Net
                    user_select = getString(R.string.m0603_s001) + "   " + getString(R.string.m0603_b003);//"你選擇:"+" "+"布";
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f002);//輸
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f001);//贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f003);//平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                    }
                    switch (v.getId()) {
                        case R.id.m0603_b001: //選擇剪刀scissors
                            user_select = getString(R.string.m0603_s001) + "   " + getString(R.string.m0603_b001);//"你選擇:"+" "+"剪刀";
                            user_select += getString(R.string.m0603_s001) + getString(R.string.m0603_b001);
                            switch (iComPlay) {
                                case 1:
                                    txtComPlay.setImageResource(R.drawable.scissors);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f003);//平手
                                    txtResult.setTextColor(Color.YELLOW);
                                    music(2);
                                    break;
                                case 2:
                                    txtComPlay.setImageResource(R.drawable.stone);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f002);//輸
                                    txtResult.setTextColor(Color.RED);
                                    music(3);
                                    break;
                                case 3:
                                    txtComPlay.setImageResource(R.drawable.net);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f001);//贏
                                    txtResult.setTextColor(Color.GREEN);
                                    music(1);
                                    break;
                            }
                            break;
                        //  -------------------------------------------------------------
                        case R.id.m0603_b002: //選擇石頭STONE
                            user_select += getString(R.string.m0603_s001) + getString(R.string.m0603_b002);//"你選擇:"+" "+"石頭;
                            switch (iComPlay) {
                                case 1:
                                    txtComPlay.setImageResource(R.drawable.scissors);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f001);//贏
                                    txtResult.setTextColor(Color.GREEN);
                                    music(1);
                                    break;
                                case 2:
                                    txtComPlay.setImageResource(R.drawable.stone);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f003);//平手
                                    txtResult.setTextColor(Color.YELLOW);
                                    music(2);
                                    break;
                                case 3:
                                    txtComPlay.setImageResource(R.drawable.net);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f002);//輸
                                    txtResult.setTextColor(Color.RED);
                                    music(3);
                                    break;
                            }
                            break;
                        case R.id.m0603_b003: //選擇布 Net
                            user_select += getString(R.string.m0603_s001) + getString(R.string.m0603_b003);//"你選擇:"+" "+"布";
                            switch (iComPlay) {
                                case 1:
                                    txtComPlay.setImageResource(R.drawable.scissors);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f002);//輸
                                    txtResult.setTextColor(Color.RED);
                                    music(3);
                                    break;
                                case 2:
                                    txtComPlay.setImageResource(R.drawable.stone);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f001);//贏
                                    txtResult.setTextColor(Color.GREEN);
                                    music(1);
                                    break;
                                case 3:
                                    txtComPlay.setImageResource(R.drawable.net);
                                    answer = getString(R.string.m0603_f000) + getString(R.string.m0603_f003);//平手
                                    txtResult.setTextColor(Color.YELLOW);
                                    music(2);
                                    break;
                            }
                            break;
                    }
                    txtSelect.setText(user_select);
                    txtResult.setText(answer);
            }
        }

        private void music(int i) {
            //
            if (startmusic.isPlaying()) startmusic.stop();
            if (mediaWin.isPlaying()) mediaWin.pause();
            if (mediaDraw.isPlaying()) mediaDraw.pause();
            if (mediaLose.isPlaying()) mediaLose.pause();
            //
            switch (i) {
                case 1: //
                    mediaWin.start();
                    break;
                case 2: //
                    mediaDraw.start();
                    break;
                case 3: //
                    mediaLose.start();
                    break;
                case 4: //
                    mediaend.start();
            }
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        music(2);
        //

    }

}

