package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59;//seiseki
        
        // and:score40以上、かつ50以下
        System.out.print("scoreが４0以上、かつ５０以下：");
        System.out.println(score >= 40&&score <= 50);
        
        // or:scoreが４０以上、または５０以下
        System.out.print("scoreが４０以上、または５０以下：");
        System.out.println(score>=40 || score<=50);
        
        
        // not:scoreが６０以上でない
        System.out.print("scoreが60以上ではない:");
        System.out.println(!(score>=60));
        
        
        
        
        
                

    }

}
