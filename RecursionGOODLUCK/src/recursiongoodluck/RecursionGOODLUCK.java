package recursiongoodluck;

public class RecursionGOODLUCK {
    
    //f(f(f(a))) --- a = 20
    //f(a) = 5 + a
    
    //f(20) = 5 + 20 = 25
    
    //f(f(f(20))) --- f(f(25))
    
    //f(25) = 5 + 25 = 30
    
    //f(f(f(20))) --- f(f(25)) --- f(30)
    
    //f(30) = 5 + 30 = 35
    
    //f(f(f(20))) --- f(f(25)) --- f(30) --- 35
    
    
    //5+4+3+2+1+0; 7+6+5+4+3+2+1+0; 1+0; 2+1+0; --- Summation
    
    //3+2+1
    public static int Summation(int n) {
        // Base Case
        if (n <= 0) {
            return 0; //additive identity property (x+0=x)
        }
        // Recursive Case: KEEP GOING
        else {
            //3 + Summation(2)
            //3 + 2 + Summation(1)
            //3 + 2 + 1 + Summation(0)
            //3 + 2 + 1 + 0 = 6
            return n + Summation(n-1);
        }
    }
    
    //4! --> 4*3*2*1 ---> 4 * 3!
    public static int Factorial(int n) {
        // Base Case
        if (n <= 1) {
            return 1; // multiplicative identity property (x*1=x) 
        } 
        // Recursive Case
        else {
            //4 * Factorial(3)
            //4 * 3 * Factorial(2)
            //4 * 3 * 2 * Factorial(1)
            //4 * 3 * 2 * 1 = 24
            return n * Factorial(n-1);
        }
    }
    
    //5^3 = 5 * 5 * 5 --> 5 * 5^2
    public static int Exponentiation(int n, int p) {
        // Base Case
        if (p <= 0) {
            return 1; //mult id
        } 
        // Recursive Case
        else {
            return n * Exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 3));
    }
    
}
