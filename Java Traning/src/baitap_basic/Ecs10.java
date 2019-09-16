package baitap_basic;
import java.util.*;
public class Ecs10 {
	Ecs10(){}
	
	public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		int n;
		Scanner xrc = new Scanner(System.in);
		System.out.println("Input n: ");
		n=xrc.nextInt();
		for(int i=0; i<=n; i++) {
			if(Ecs10.isPrimeNumber(i)) {
				System.out.print(i+"  ");
			}
		}
	}
}
