/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Random;

/**
 *
 * @author ADMINISTRADOR
 */
public class Bingo_Demo {

    public int[] resultadoB = new int[15];
    public int[] resultadoI = new int[15];
    public int[] resultadoN = new int[15];
    public int[] resultadoG = new int[15];
    public int[] resultadoO = new int[15];

    int res;

    public void sortear() {
        Random rnd = new Random();
        int n = 15;  //numeros aleatorios
        int k = 15;  //auxiliar de B;
        int kI = 15;  //auxiliar de I;
        int kN = 15;  //auxiliar de N;
        int kG = 15;  //auxiliar de G;
        int kO = 15;  //auxiliar de O;
        int[] numerosB= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] numerosI = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] numerosN = {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
        int[] numerosG = {46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
        int[] numerosO = {61,62,63,64,65,66,67,68,69,70,71,72,73,74,75};
        //se rellena una matriz desordenada del 1 al 15(1..n)
        
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(k);
            resultadoB[i] = numerosB[res];
            numerosB[res] = numerosB[k - 1];
            k--;
        }

        //se rellena una matriz desordenada del 16 al 30(1..n)
       
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kI);
            resultadoI[i] = numerosI[res];
            numerosI[res] = numerosI[kI - 1];
            kI--;
        }
        //se rellena una matriz desordenada del 31 al 45(1..n)
        
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kN);
            resultadoN[i] = numerosN[res];
            numerosN[res] = numerosN[kN - 1];
            kN--;
        }
        //se rellena una matriz desordenada del 46 al 60(1..n)
        
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kG);
            resultadoG[i] = numerosG[res];
            numerosG[res] = numerosG[kG - 1];
            kG--;
        }

        //se rellena una matriz desordenada del 61 al 75(1..n)
        
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kO);
            resultadoO[i] = numerosO[res];
            numerosO[res] = numerosO[kO - 1];
            kO--;
        }

    }

}
