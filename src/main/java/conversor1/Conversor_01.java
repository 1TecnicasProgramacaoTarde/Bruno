package conversor1;

import java.util.Scanner;
public class Conversor_01 { 
    
    static double ConversaoCelsiusFahrenheit(double C) {
            
        return 9 * C / 5 + 32;
        
    }
            public static void main (String [ ] args) {
                Scanner leitor = new Scanner (System.in);
                System.out.println("Digite um número em Celsius: ");
                double celsius = leitor.nextInt(); 
                 System.out.println("O número convertido em Fahrenheit é: ");
                System.out.println(ConversaoCelsiusFahrenheit(celsius));
                
        
    }
            
}