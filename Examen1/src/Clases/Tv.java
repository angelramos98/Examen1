package Clases;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */
public class Tv {
    private String Marca;
    private Integer Pulgadas;
    private Boolean Pantall_Plana;
    private List<Canal> canals = new ArrayList<>();

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        Pulgadas = pulgadas;
    }

    public Boolean getPantall_Plana() {
        return Pantall_Plana;
    }

    public void setPantall_Plana(Boolean pantall_Plana) {
        Pantall_Plana = pantall_Plana;
    }

    public Tv(String marca, Integer pulgadas, Boolean pantall_Plana) {
        Marca = marca;
        Pulgadas = pulgadas;
        Pantall_Plana = pantall_Plana;
    }

    public Tv() {
    }

    public void agregaCanal(Canal c) {
        canals.add(0,c);
    }
    public List<Canal> getCanals() {
        return getCanals();
    }

    public List<Tv> getTvs(){return getTvs();}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Marca");
        Tv tv = new Tv();
        tv.setMarca(scn.next());
        System.out.println("Pulgadas");
        tv.setPulgadas(scn.nextInt());
        System.out.println("Pantalla Plana");
        if (scn.next().equalsIgnoreCase("S"))
            tv.setPantall_Plana(true);

        //System.out





    }
}
