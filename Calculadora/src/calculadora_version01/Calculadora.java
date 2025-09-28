package calculadora_version01;

import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args){
		
		String operacion = "";
        int Valor1 = 0;
        int Valor2 = 0;
        int resultado = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca el primer valor: ");
        Valor1 = scan.nextInt();
        
        System.out.println("Introduzca el segundo valor: ");
        Valor2 = scan.nextInt();
        
        System.out.println("¿Qué operación quieres realizar? (+, -, *, %): ");
        operacion = scan.next();
        
        switch(operacion) {
            case "+":
                
                break;
            case "-":
                
                break;
            case "*":
                
                break;
            case "%":
                
                break;
            default:
                System.out.println("Operación no válida.");
        }
        
        scan.close();
	}
	
}
