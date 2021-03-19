package pbo2Latihan1;

/**
 *
 * @author genta
 */
public class ujiBus {
    public static void main(String[] args) {
    Bus busMini = new Bus();
    busMini.penumpang=5;
    busMini.maxpenumpang=15;
    busMini.cetak();

    busMini.penumpang=busMini.penumpang+5;
    busMini.cetak();

    busMini.penumpang=busMini.penumpang-2;
    busMini.cetak();

    busMini.penumpang=busMini.penumpang+8;
    busMini.cetak();
    }
}
