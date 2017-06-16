import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		String str;
//		do{
//			System.out.print("Entrer un nombre : ");
//			str = sc.nextLine();
//			if (str != "stop"){
//				int a = Integer.parseInt(str);
//				int nb = carre(a);
//				System.out.println("le résultat est " + nb);
//			}
//			
//		}while(str != "stop");
		int[] tab2 = tableauCarre(10);
		for(int element : tab2){
			System.out.print(element + " ");
		}
		
	}
	public static int carre(int i) {
		return i*i;
	}
	public static int[] tableauCarre(int len){
		int[] tab = new int[len];
		int nb = 1;
		for(int i=0; i< tab.length;i++){
			tab[i] = nb * nb;
			nb++;
		}
		return tab;
	}
}
