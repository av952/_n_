package siono.game.android.av.siono;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level_1 extends AppCompatActivity implements View.OnClickListener,
        Frag_home.OnFragmentInteractionListener,Frag_levels.OnFragmentInteractionListener{

    private ImageView vida,btn_si,btn_no;
    private TextView mi_crono;

    private int tam_array;

    //instanciar
    Evaluacion evaluacion;

    //IMAGENES RANDOM-------------------------------------------------------------------------------
    private int[] array_fv={
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
    //IMAGENES RANDOM-------------------------------------------------------------------------------

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

        //instanciar
        evaluacion = new Evaluacion();


    }
    //IMAGENES RANDOM-------------------------------------------------------------------------------
    private int[] arrayvidas={
            R.drawable.vidas2_1,
            R.drawable.vidas2_2,
            R.drawable.vidas2_3,
    };

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnBegin:
                evaluacion.azar();

        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public int get_todo(){
        tam_array=array_fv.length;

        return tam_array;
    }
}
