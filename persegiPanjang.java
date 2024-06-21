
package projectKalkulator;

import projectpbo.*;

public class persegiPanjang {
    double luas;
    double keliling;
    
    public double setLuas(double p, double l){
        luas = p * l;
        return luas;
    } 
    
    public double setKeliling(double p, double l){
        keliling = 2*(p+l) ;
        return keliling;
    }
}
