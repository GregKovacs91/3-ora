import java.util.Scanner;
public class kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az els� oper�tort");
		System.out.println("1. operandus: ");
		Double elso_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az m�sodik oper�tort");
		System.out.println("2. operandus: ");
		Double masodik_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az oper�tort");
		System.out.println(" operator: ");
		String operator = bemenet.nextLine();
		operator = bemenet.nextLine();
		
		double eredmeny;
		
		switch (operator){
		case "+":
		System.out.println("osszead�s");
		System.out.println(elso_operandus+masodik_operandus);
		break;
		
		case "-":
		eredmeny =elso_operandus-masodik_operandus;
		System.out.println("kivonas");
		System.out.println(elso_operandus-masodik_operandus);
		break;
		
		case "*":
			eredmeny =elso_operandus*masodik_operandus;
			System.out.println("szorzas");
			System.out.println(elso_operandus*masodik_operandus);
			break;
			
		case "*/":
			eredmeny =elso_operandus*masodik_operandus;
			System.out.println("osztas");
			System.out.println(elso_operandus/masodik_operandus);
			break;
		
		default:
		
			break;
		}
		
		System.out.println("Kerem adja meg a kifejezest:");
		String kifejezes = bemenet.nextLine();

		// 3+2
		String[] eredmenytomb = kifejezes.split(" ");
		
		switch (eredmenytomb[1]){
		case "+":
		System.out.println("osszead�s:");
		System.out.println(eredmenytomb[0]+eredmenytomb[2]);
		break;
	
		case "-":
			eredmeny = Double.parseDouble(eredmenytomb[0]) - Double.parseDouble(eredmenytomb[2]);
			System.out.println("kivonas:");
			System.out.println(eredmeny);
			break;
		
		
		}
		
	}

}
