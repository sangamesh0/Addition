
    public class Addition2 {
        public static void main(String[] args) {
            double num1 = 10.5; // You can assign any value you want
            double num2 = 20.5; // You can assign any value you want
            double num3 = 30.5; // You can assign any value you want
            
            double sum = addNumbers(num1, num2, num3);
            
            System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);
        }
        
        public static double addNumbers(double num1, double num2, double num3) {
            return num1 + num2 + num3;
        }
    }
    

