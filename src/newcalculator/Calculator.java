
package newcalculator;


public class Calculator {
    
    private double number1;
    private double number2;
    private double result;
    
    
     
    public double addition(double n1 ,double  n2){
        this.result = n1 + n2;
        return result;
    }
    
    public double multiplication(double n1 ,double  n2){
        this.result = n1 * n2;
        return result;
    }
        
    public double division(double n1 ,double  n2) {
        if (n2==0)
            throw new ArithmeticException("Cannot divide by zero"); 
        else    
        {
            this.result = n1 / n2;
            return result;
        }
        
    }
    
    public double root(double n1){
        if(n1<0)
            throw new RuntimeException("no square root for -ve numbers"); 
        else
        {
            this.result = Math.sqrt(n1);
            return result;
        }
        
    }
    
    public double subtraction(double n1 ,double  n2){
        this.result = n1 - n2;
        return result;
    }
    
    public double power(double n1, double p){
        return Math.pow(n1,p);
    }
    
    public void clear(){
        this.result = 0;
    }
    
    public double factorial(double n){
        if(n<0)
            throw new ArithmeticException("No factorial fo negative numbers"); 
        else if(n == 0 || n == 1)
            return 1;
        result = factorial(n-1) * n;
        return result;
        
    }
    
    public double modulus(double n1, double n2){
        return n1 % n2;
    }
    
    public double getResult(){
        return this.result;
    }
}