package siono.game.android.av.siono;

import android.util.Log;
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



    public  Evaluacion(int tam, int cant){
        tam_arreglo=tam;
        cantidad = cant;

    }

    public void azar(int tam, int cant,ImageView im){
        intrandom = random.nextInt(tam_arreglo);

        if(cant<=tam){

        }

    }


}

