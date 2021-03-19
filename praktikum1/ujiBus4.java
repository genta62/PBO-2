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
public class ujiBus4 {
    public static void main(String[] args) {
         Bus4 Bus = new Bus4(100);
        Bus.getPassword(24);
        Bus.cetakPenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getPassword(30);
        Bus.plusPenumpang(25);
        Bus.cetakPenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getPassword(24);
        Bus.plusPenumpang(21);
        Bus.cetakPenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getPassword(35);
        Bus.plusPenumpang(29);
        Bus.cetakPenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getPassword(24);
        Bus.plusPenumpang(43);
        Bus.cetakPenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getPassword(24);
        Bus.plusPenumpang(18);
        Bus.cetakPenumpang();
        System.out.println();
        

        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
}
