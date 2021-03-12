import java.util.*;
import java.util.Scanner;

public class Hello {
	
    public static void main(String[] args) {
		
        Scanner inp= new Scanner(System.in);
        
		System.out.println("Insira o primeiro e o segundo número:");
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        
        System.out.println("Escolha: 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão:");
        int choose;
        choose = inp.nextInt();
        
		switch (choose){
			case 1:
				System.out.println(add(num1, num2));
				break;
			case 2:
				System.out.println(sub(num1, num2));
				break;      
			case 3:
				System.out.println(mult(num1, num2));
				break;
			case 4:
				System.out.println(div(num1, num2));
				break;
			default:
				System.out.println("Operação não permitida");
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }
	
    public static int sub(int x, int y) {
        return x-y;
    }
    
	public static int mult(int x, int y) {
        int result = x*y;
        return result;
    }
	
    public static int div(int x, int y) {
        int result = x/y;
        return result;
    }
}