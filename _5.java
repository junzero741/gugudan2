import java.util.Scanner;

public class _5 {

	public static void main(String[] args) {
	
//		지금까지 2 ~ 5단까지 구현하기 위해 단순, 반복적인 작업이 많았다.
//		이 같은 단순, 반복적인 작업을 변수와 반복문을 활용해 제거하면서 6단과 7단을 구현한다.
		System.out.println("while문으로 구구단 만들기: 숫자 6 혹은 7을 입력하세요 ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		
		int i = 1;
		while(i<10) {
			
			int result = value * i;
			i = i + 1;
			System.out.println(result);
			
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		System.out.println("for문으로 구구단 만들기: 숫자 6 혹은 7을 입력하세요 ");
		Scanner scanner2 = new Scanner(System.in);
		int value2 = scanner2.nextInt();
		
		for(int j=1; j<10; j++) {
			int result = value2 * j;
			System.out.println(result);
		}

		
		
		
	}

}
