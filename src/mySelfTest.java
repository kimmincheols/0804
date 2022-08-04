//피보나치 수열 7개를 출력하시오 (1,1,2,3,5,8,13)
public class mySelfTest {
	public static void main(String[] args) {
		int sum = 0;
		int[] fibo = new int[sum];
		for (int i = 0; i < 7; i++) {
			if (i == 0)
				fibo[0] = 0;
			else if (i == 1)
				fibo[1] = 1;
			else
				fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		System.out.println(fibo[3]);
	}
}
