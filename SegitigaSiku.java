
package projectKalkulator;

public class SegitigaSiku {
    double sisiMiring;
    double luas;
    double keliling;
    
    public double setSisiMiring(double a, double b){
        double c = (Math.pow(a,2))+(Math.pow(b,2));
        sisiMiring = Math.sqrt(c);
        return sisiMiring;
    }
    
    public double setLuas(double a, double t){
        luas = (a*t)/2;
        return luas;
    }
    
    public double setKeliling(double a, double b, double c){
        keliling = a+b+c;
        return keliling;
    }
}
