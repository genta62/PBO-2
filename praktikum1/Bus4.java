/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author genta
 */
public class Bus4 {
    public double penumpang, maxPenumpang, counter, penumpangBaru;
    
    //konstruktor
    public Bus4(double maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang=0;
        }
    //method mutator 
    public void plusPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Berat Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }

    public void getPassword(int password) {
        if (password == 24) {
            System.out.println("Password Benar");

        } else {
            System.out.println("Password Salah");
        }

    }

    public double getAverage() {
        double average;
        return penumpang / counter;

    }

    public void cetakPenumpang() {
        System.out.println("Berat Penumpang Bus Sekarang adalah = " + penumpang);
        System.out.println("Maksimum berat penumpang yang seharusnya adalah = " + maxPenumpang);

    }
}

