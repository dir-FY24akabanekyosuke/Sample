package sample;

public class ExemptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        try {
            //ここに例外コード
            System.out.println("割り算開始");
            int a=10/0;
        } catch (ArithmeticException e) {
            // Ariが発生した時の処理
            System.out.println("ArithmeticException caught:"+ e.getMessage());
           
        } finally {
            //例外の有無なし
            System.out.println("割り算終了");
            
        }
        
        System.out.println("処理終了");
        
            
         
        }
        
        public static int divide(int a, int b)throws ArithmeticException{
            if(b==0) {
                //０での除算を試みた場合、ARIを投げます
                throw new ArithmeticException("ゼロ除算エラーです");
                
               
                
            }
            return a/b;
            
        }
    }

}
