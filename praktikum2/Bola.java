/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author genta
 */
public class Bola {
    public double jariJari=20; 
    public double diameter, luasPermukaan, volume;
    
    public void setJariJari(){
        jariJari= 21;
        System.out.println("Jari-jari yang digunakan adalah : "+jariJari);
    }
    public void showDiameter(){
        diameter= 2*jariJari;
        System.out.println("Diameter yang digunakan adalah  : "+diameter);
    }
    public void showLuasPermukaan(){
        luasPermukaan= 4*Math.PI*jariJari*jariJari;
        System.out.println("Luas permukaan bola adalah      : "+luasPermukaan);
    }
    public void showVolume(){
        volume= 4/3*Math.PI*jariJari*jariJari*jariJari;
        System.out.println("Volume bola adalah              : "+volume);
    }
}
