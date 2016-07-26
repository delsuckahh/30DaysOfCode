package looppractice;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        while(x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
    }
    
    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while(x < 10);
    }    
    
    public static void practiceForLoop() {
        for(int x = 0; x < 10; x++) {
            for(int y = 0; y < 10; y++){
                System.out.println("("+x+","+y+")");
            }
        }
    }
    
    public static void modThree(int n) {
        for(int x=3; x<n; x+=3) {
            System.out.println(x);
        }
    }
    
    public static void modFive(int n) {
        for(int x=5; x<n; x+=5) {
            System.out.println(x);
        }
    }
    
    public static void modThreeAndFive(int n) {
        for(int x=3; x<n; x++) {
            if(x%3==0) {
                System.out.println(x);
            } else if (x%5==0) {
                System.out.println(x);
            } else{
                
            }
        }
    }
    
    public static void sumModThreeAndFive(int n) {
        int sum = 0;
        for (int x = 1; x < n; x++) {
            if (x%3==0 || x%5 == 0) {
            sum += x;
            }
        } System.out.println(sum);
    }
    
    public static void main(String[] args) {
//        System.out.println("While Loop: ");
//        practiceWhileLoop();
//        System.out.println("Do While Loop: ");
//        practiceDoWhileLoop();
//        System.out.println("For Loop: ");
//        practiceForLoop();

        
        
        sumModThreeAndFive(10);
        
  
        
        
        
        
    }
    
}
