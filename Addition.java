public class Addition {
    public static void main(String[] args) {
        double num1 = 10.5; // You can assign any value you want
        double num2 = 20.5; // You can assign any value you want
        
        double sum = addNumbers(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }
}
