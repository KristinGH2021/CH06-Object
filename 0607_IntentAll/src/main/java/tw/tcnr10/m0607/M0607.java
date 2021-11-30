package tw.tcnr10.m0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M0607 extends AppCompatActivity {

    private Intent intent = new Intent();
    private Button b001;
    private Button b002;
    private Button b003;
    private Button b004;
    private Button b005;
    private Button b006;
    private Button b007;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0607);
        setupViewCompent();
    }

    private void setupViewCompent() {

        b001 = (Button) findViewById(R.id.m000_b0500);
        b002 = (Button) findViewById(R.id.m000_b0501);
        b003 = (Button) findViewById(R.id.m000_b0502);
        b004 = (Button) findViewById(R.id.m000_b0504);
        b005 = (Button) findViewById(R.id.m000_b0505);
        b006 = (Button)findViewById(R.id.m000_b0604);
        b007 = (Button)findViewById(R.id.m000_b0606);



        b001.setOnClickListener(buttonOn);
        b002.setOnClickListener(buttonOn);
        b003.setOnClickListener(buttonOn);
        b004.setOnClickListener(buttonOn);
        b005.setOnClickListener(buttonOn);
        b006.setOnClickListener(buttonOn);
        b007.setOnClickListener(buttonOn);

    }


    private View.OnClickListener buttonOn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.m000_b0500:
                    intent.putExtra("class_title", "PK0500");
                    intent.setClass(M0607.this, M0500.class);
                    break;
                case R.id.m000_b0501:
                    intent.putExtra("class_title", "PK0501");
                    intent.setClass(M0607.this, M0501.class);
                    break;
                case R.id.m000_b0502:
                    intent.putExtra("class_title", "PK0502");
                    intent.setClass(M0607.this, M0502.class);
                    break;
                case R.id.m000_b0504:
                    intent.putExtra("class_title", "PK0504");
                    intent.setClass(M0607.this, M0504.class);
                    break;
                case R.id.m000_b0505:
                    intent.putExtra("class_title", "PK0505");
                    intent.setClass(M0607.this, M0505.class);
                    break;
                case R.id.m000_b0604:
                    intent.putExtra("class_title", "PK0604");
                    intent.setClass(M0607.this, M0604.class);
                    break;
                case R.id.m000_b0606:
                    intent.putExtra("class_title", "PK0606");
                    intent.setClass(M0607.this, M0606.class);
                    break;
            } //end switch
            //class 執行


            startActivity(intent);

//            intent.putExtra("class_title",getString(R.string.m000_b0500));
//
//            Intent intent = this.getIntent();
//            String mode_title=intent.getStringExtra("class_title");
//            this.setTitle(mode_title);


        }
    };
}