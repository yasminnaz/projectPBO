
package projectKalkulator;

public class Segitiga {
    double luas;
    double keliling;
    
    public double setLuas(double a, double t){
        luas = (a*t)/2;
        return luas;
    } 
    
    public double setKeliling(double a, double b, double c){
        keliling = a+b+c;
        return keliling;
    }
}
