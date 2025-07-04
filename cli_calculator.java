import java.util.Scanner;

public class cli_calculator {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to CLI Calculator!");

            System.out.println("Enter your number and operation in this format: number1 operation number2");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("exit"))
            {
                System.out.println("Exiting the calculator. Goodbye!");
                sc.close();
                return;
            }

            String[] parts = input.split(" ");


            if(parts.length !=3){
                System.out.println("Invalid Format");
                continue;
            }
            
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[2]);
            char operation = parts[1].charAt(0);

            double result = 0;

            switch (operation) {
                
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                    result = num1/num2;
                    break;
            
                    default:
                        System.out.println("Invalid Operation");
                        break;
                }
                System.out.println("Result: " + result);
            }
            

        }

        


    }
    
// This code implements a simple command-line calculator that takes user input in the format "number1 operation number2".
