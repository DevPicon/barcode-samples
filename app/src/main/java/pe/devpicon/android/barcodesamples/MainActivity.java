package pe.devpicon.android.barcodesamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMobileVision = findViewById(R.id.button_mobile_vision);
        buttonMobileVision.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_mobile_vision:
                startActivity(new Intent(this, MobileVisionActivity.class));
                break;
        }
    }
}
