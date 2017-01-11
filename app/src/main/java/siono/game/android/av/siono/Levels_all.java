package siono.game.android.av.siono;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Levels_all extends AppCompatActivity implements View.OnClickListener{

    private ImageView btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_all);


        btn_1 =(ImageView)findViewById(R.id.btn_level_1);
        btn_1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_level_1:
                Intent i = new Intent(this,Level_1.class);
                startActivity(i);
                break;
        }

    }
}
