import java.util.Random;
public class rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tomb [] = new int[10];
		Random veletlenobjektum = new Random();
		System.out.println("tomb elemei: ");
		for(int i=0; i<tomb.length; i++ ) {
			tomb[i] = veletlenobjektum.nextInt(50) + 1;
			System.out.println(tomb[i]);
		}
		System.out.println("a t�mb elemei visszafel�:");
		for(int i=tomb.length -1; i>=0 ;i-- ) {
			System.out.println(tomb[i]);
		}
		int maxindex = 0;
		System.out.println("a t�mb elemeinek maximuma:");
		for(int i=1; i<tomb.length;i++){
			if(tomb[i] > tomb[maxindex]){
				maxindex = i;
			}
			
		}
		System.out.println("Legnagyobb �rt�k: ");
		System.out.println(tomb[maxindex]);
		
	}

}

// legnagyobb p�ros

