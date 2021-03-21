package modul3Latihan1;

/**
 *
 * @author genta
 */
public class Pertama {
    private int a= 10;
    
    protected void terprotek(){
        System.out.println("method ini hana untuk anak");
    }
    
    public void info(){
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+this.getClass().getName());
    }
    
}
