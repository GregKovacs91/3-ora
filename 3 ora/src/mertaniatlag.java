import java.util.Scanner;
public class mertaniatlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valostomb[] = new double[10];
		Scanner bemenet = new Scanner(System.in);
		for (int i= 0; i< valostomb.length; i++){
			System.out.println("kerem adja meg a(z) "+(i+1)+". elem erteket!");
			valostomb[i] = bemenet.nextDouble();
		}
	}

}
