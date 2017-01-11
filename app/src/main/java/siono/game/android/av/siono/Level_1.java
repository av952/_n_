package siono.game.android.av.siono;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Level_1 extends AppCompatActivity  implements View.OnClickListener,
        Frag_home.OnFragmentInteractionListener,Frag_levels.OnFragmentInteractionListener,
Comunicacion_niveles{

    //IMAGENES RANDOM-------------------------------------LEVEL_1-----------------------------------
    /*private int[] imagenesfruver ={
            R.drawable.aasparagus256, R.drawable.aaubergine256,
            R.drawable.abeans256, R.drawable.abroccoli256,R.drawable.acabbage256,
            R.drawable.acarrot256,R.drawable.acauliflower256,
            R.drawable.achives256, R.drawable.alettuce256,R.drawable.aonion256,R.drawable.apeas256,
            R.drawable.apumpkin256,R.drawable.asalad256,
            R.drawable.bapple256,R.drawable.bavocado256,R.drawable.bbanana256,
            R.drawable.bblueberries256, R.drawable.bcherries256,R.drawable.bcoconut256,
            R.drawable.bfig256,R.drawable.bgrapes256,
            R.drawable.blemon256,R.drawable.borange256,R.drawable.bpeach256,R.drawable.bpear256,
            R.drawable.bpepper256,R.drawable.bpineapple256,R.drawable.braspberry256,
            R.drawable.bstrawberry256,R.drawable.btomato256, R.drawable.bwatermelon256
    };
    //ARRAY VIDAS----------------------------------------------------------------------------------
    private int[] arrayvidas={
            R.drawable.vidas2_1,
            R.drawable.vidas2_2,
            R.drawable.vidas2_3,
    };

    private int[]array_pregunta={
            R.drawable.preg_fruta_188x66,
            R.drawable.preg_verdura_188x66
    };*/


    public ImageView vida,btn_si,btn_no,img_level_1,img_preg;
    public TextView mi_crono;
    private Random random = new Random();

    private int op, cantidad;//op=opcion escogida(button),cantidad=cantidad de clicks
    private int mal,bien,cuantasvidas;

    private long tiempoprimerclick;//para el metodo onbacpresed


    public int c;//para enviar cantidad
    private int tam_array;


    public int tam,can;

    //instanciar
    Evaluacion evaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1);
        //BOTONES
        btn_no =(ImageView)findViewById(R.id.btnno);
        btn_no.setOnClickListener(this);
        btn_si =(ImageView)findViewById(R.id.btnsi);
        btn_si.setOnClickListener(this);
        //VIDA
        vida = (ImageView)findViewById(R.id.vidas);
        //IMAGENES DEL CENTRO
        img_level_1 = (ImageView)findViewById(R.id.imagenes_level_1);
        //IMG PREGUNTA
        img_preg = (ImageView)findViewById(R.id.preg_fv);

        //instanciar
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnsi:
                op=1;
                cantidad++;
                evaluacion();

                break;
            case R.id.btnno:
                op=2;
                cantidad++;
                evaluacion();

                break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    @Override
    public void evaluacion() {
        int p = random.nextInt(imagenesfruver.length);//da una imagen random
        int ran = random.nextInt(array_pregunta.length);//pregunta random

        if(p<=12 && op==1 && cantidad<=imagenesfruver.length-1&& ran==1){//verdura/si/?verdura = bien
           // ok.play(flujoDeMusica,1,1,0,0,1);//sp.play(soundID, leftVolume, rightVolume, priority, loop, rate);
            bien++;
        }else if(p<=12 && op==2 && cantidad<=imagenesfruver.length-1&& ran==1){//verdura/no7verdura/ = mal
           // no.play(flujoDeMusica,1,1,0,0,1);
            mal++;
        }else if(p<=12 && op==1 && cantidad<=imagenesfruver.length-1&& ran==0){//verdura/si/fruta = mal
          //  no.play(flujoDeMusica,1,1,0,0,1);
            mal++;
        }else if(p<=12 && op==2 && cantidad<=imagenesfruver.length-1&& ran==0){//verdura/no/fruta =bien
           // ok.play(flujoDeMusica,1,1,0,0,1);
            bien++;
        }else if(p>=13&& op==1 && cantidad<=imagenesfruver.length-1&& ran==0){
           // ok.play(flujoDeMusica,1,1,0,0,1);//sp.play(soundID, leftVolume, rightVolume, priority, loop, rate);
            bien++;
        }else if(p>=13 && op==2 && cantidad<=imagenesfruver.length-1&& ran==0){
           // no.play(flujoDeMusica,1,1,0,0,1);
            mal++;
        }else if(p>=13 && op==1 && cantidad<=imagenesfruver.length-1&& ran==1){
          //  no.play(flujoDeMusica,1,1,0,0,1);
            mal++;
        }else if(p>=13 && op==2 && cantidad<=imagenesfruver.length-1&& ran==1){
          //  ok.play(flujoDeMusica,1,1,0,0,1);
            bien++;
        }
        //SI PERDE SE EJECUTA ESTO------------------------------------------------------------------
        if(mal==3){
            fin_juego(2);
        }

        switch (mal){
            case 0:
                cuantasvidas=2;
                break;
            case 1:
                cuantasvidas=1;
                break;
            case 2:
                cuantasvidas=0;
                break;
        }
        vida.setImageResource(arrayvidas[cuantasvidas]);

        azar(p,ran);
    }

    @Override
    public void respuestaFinal(int cantbuenas) {

    }

    @Override
    public void azar(int p1,int ran1) {

        if(cantidad<= imagenesfruver.length){
            img_preg.setImageResource(array_pregunta[ran1]);//aleatorio para la pregunta
            img_level_1.setImageResource(imagenesfruver[p1]);
        }


    }

    @Override
    public void fin_juego(int i) {

    }

    @Override
    public void onBackPressed(){
        if(tiempoprimerclick+intervalo>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(this,"vuelve a aprecionar para salir",Toast.LENGTH_SHORT).show();
        }
        tiempoprimerclick = System.currentTimeMillis();

    }
}
