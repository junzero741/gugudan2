import java.util.Scanner;

public class _4 {

	public static void main(String[] args) {
//		구구단에서 4단과 5단을 계산한 결과 값을 변수에 저장한 후 저장한 변수 값을 출력한다.
//		4단과 5단은 한번 결정하면 바뀌지 않는 값이다. 따라서 4단과 5단에 해당하는 상수 값으로 만든 후 프로그램을 구현한다.
//		예를 들어 4단은 4 곱하기 1 계산 결과 값을 i라는 변수에 저장하고, i라는 변수에 저장한 결과 값을 출력한다.
		
		int result = 4*1;
		System.out.println(result);
		result =4*2;
		System.out.println(result);
		result =4*3;
		System.out.println(result);
		result =4*4;
		System.out.println(result);
		result =4*5;
		System.out.println(result);
		result =4*6;
		System.out.println(result);
		result =4*7;
		System.out.println(result);
		result =4*8;
		System.out.println(result);
		result =4*9;
		System.out.println(result);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
//		사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
//		예를 들어 사용자가 4라는 숫자를 입력하면 4단 전체를 계산해 출력한다.
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		System.out.println(value*1);
		System.out.println(value*2);
		System.out.println(value*3);
		System.out.println(value*4);
		System.out.println(value*5);
		System.out.println(value*6);
		System.out.println(value*7);
		System.out.println(value*8);
		System.out.println(value*9);
		
		
	}

}
