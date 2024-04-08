package sample;

public class MethodSample {

    public static void main(String[] args) {
        var number1=100;
        var number2=10;
        
        sumMethod1(number1,number2);
        
        

    }

    private static void sumMethod1(int number1, int number2) {
       var result=number1+number2;
       System.out.println("sumMethod1の結果は"+result);
       
        
    }

}
