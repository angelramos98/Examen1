package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */
public class Principal {
    private List<Tv> tvs = new ArrayList<>();


    protected void AgregaTv(Tv t)  {
        tvs.add(0,t);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("1. Agregar tv");
            System.out.println("2. Agregar Canal");
            System.out.println("3. Salir");

            opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Marca");
                    Tv tv = new Tv();
                    tv.setMarca(scn.next());
                    System.out.println("Pulgadas");
                    tv.setPulgadas(scn.nextInt());
                    System.out.println("Pantalla Plana");
                    if (scn.next().equalsIgnoreCase("S"))
                        tv.setPantall_Plana(true);
                    break;
                case 2:
                    System.out.println("Numero");
                    Canal canal = new Canal();
                    //canal.setNumero(scn.next());
                    System.out.println("Temática");
                    System.out.println("Permitido");

                    break;
                case 3:
                salir = true;
                break;
                }
            }
        }
    }


