package siono.game.android.av.siono;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    ImageView btnbegin,btnhtp,btnlevels;
    public SoundPool sp;
    public int flujoDeMusica;
    private final int intervalo =2000;
    private long tiempoprimerclick;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    //Frac_htp frac1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //se crea la interfas grafica
        btnbegin =(ImageView) findViewById(R.id.btnBegin);
        btnhtp =(ImageView) findViewById(R.id.btnHtp);
        btnlevels =(ImageView) findViewById(R.id.btnLevels);
        btnbegin.setOnClickListener(this);
        btnhtp.setOnClickListener(this);
        btnlevels.setOnClickListener(this);

        //SOUNDPOOL BUTTONS
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        flujoDeMusica = sp.load(this,R.raw.click,1);

        /*//FRAGMENT
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        frac1 = new Frac_htp();//relaiona el fragmento
        fragmentTransaction.add(R.id.conten,frac1);*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnHtp:
                sp.play(flujoDeMusica,1,1,0,0,1);
                //fragmentTransaction.commit();
                break;
            case R.id.btnBegin:
                sp.play(flujoDeMusica,1,1,0,0,1);
                /*Intent ir2 = new Intent(this,Level_1.class);
                startActivity(ir2);
                break;*/
            case R.id.btnLevels:
                sp.play(flujoDeMusica,1,1,0,0,1);
                /*Intent ir3 = new Intent(this,Levels.class);
                startActivity(ir3);
                break;*/

        }

    }
    //ACCION REALIZADA CUANDO SE PRECIONA EL BOTON DE REGRESAR
    public void onBackPressed(){
        if(tiempoprimerclick+intervalo>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(this,"Vuelve a aprecionar para salir",Toast.LENGTH_SHORT).show();
        }
        tiempoprimerclick = System.currentTimeMillis();

    }


    public void borrar(){
        if(1==1){
            int q= 2;
        }

    }
}
