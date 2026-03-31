package pctEx02;
import java.util.Scanner;
public class Ex02 {
	
		public static void main(String[] args) {
			
			Scanner borabill = new Scanner(System.in);
			double peso, altura, result, res;
			String resp;
			result = peso / (altura*altura);
			
			System.out.println("------CALCULADORA DE IMC------");
			
			System.out.println("-------Digite seu peso:-------");
			peso = borabill.nextInt();
			
			System.out.println("------Digite sua altura:------");
			altura = borabill.nextInt();
			
			res = (result > 25 && result <= 30) ? 
			"Você está normal" : 
				res = (result > 30 && result <= 40)? 
						"Você está Sobrepeso" : 
							res = (result > 30 && result <= 40);
			
			case ("Normal"):
				res = result > 25 && result <= 30;
			break;
			
			case (result > 25 && result <= 30):
				System.out.println("Você está Sobrepeso");
			break;
			
			case (result > 30 && result <= 40):
				System.out.println("Você está Obesidade");
			break;
			
			case (result > 40):
				System.out.println("Você está Obesidade Mórbida");
			break;
			
			default:
				System.out.println("Opção inválida");	
			}
			
			
			borabill.close();
		}
	}
