package siono.game.android.av.siono;

import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Usuario on 10/01/2017.
 */

public class Evaluacion {

    private Random random;
    private int intrandom;//almacena el valor del random
    public int tam_arreglo;
    public int cantidad;//cantidad de clicks realizados
    public ImageView img;
    private Level_1 level_1 = new Level_1();

    public void Evaluacion(int tam, int cant,ImageView img2){
        tam_arreglo=tam;
        cantidad = cant;
        img =img2;

    }


    public void evalua(int tam, int cant,ImageView img2){
        tam = this.tam_arreglo;

    }

    public void azar(){

       int i= level_1.get_todo();

        intrandom= random.nextInt(tam_arreglo);

        System.out.println(i+intrandom);

    }

}

