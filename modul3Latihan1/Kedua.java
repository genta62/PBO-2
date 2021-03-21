package modul3Latihan1;

/**
 *
 * @author genta
 */
public class Kedua extends Pertama {
    private int b=8;
    
    protected void bacaSuper(){
        System.out.println("Nilai b = "+b);
        terprotek();
        info();
    }
}
