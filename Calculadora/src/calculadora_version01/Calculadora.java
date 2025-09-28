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
                /*Falta inplementar en la branch Jordi la operacion Suma*/
                break;
            case "-":
            	/*Falta inplementar en la branch Jordi la operacion Resta*/
                break;
            case "*":
            	resultado = Multiplicar(Valor1, Valor2, resultado);
                break;
            case "%":
            	if (Valor2 != 0) {
                    resultado = Dividir(Valor1, Valor2, resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre 0");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
        System.out.println("El resultado es: "+ resultado);
        scan.close();
	}
	
	private static int Multiplicar(int multi1, int multi2, int resultado) {
        resultado = multi1 * multi2;
        return resultado;
    }
    
    private static int Dividir(int div1, int div2, int resultado) {
        resultado = div1 / div2;
        return resultado;
    }
	
}
