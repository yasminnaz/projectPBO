
package projectKalkulator;

public class Lingkaran {
    double luas;
    double keliling;
    double diameter;
    
    public double setDiameter(double r){
        diameter = 2 *r;
        return diameter;
    }
    public double setLuas(double r){
        luas = Math.PI * Math.pow(r, 2);
        return luas;
    } 
    
    public double setKeliling(double r){
        keliling = 2*Math.PI*r;
        return keliling;
    }
}
