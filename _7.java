
public class _7 {

	public static void main(String[] args) {
		
//		구구단 결과을 배열에 저장한 후 배열의 결과를 출력한다.
		
		int[] array1 = new int[9];
		int num = 7;
		
		for(int i=0; i<array1.length; i++) {
			array1[i] = num * (i + 1);
			System.out.println(array1[i]);
		}

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
//		2단에서 9단까지 전체를 출력하는데 많은 중복 코드가 발생한다.
//		반복문을 사용해 2단과 9단에 대한 중복을 제거한다.
//		배열도 당연히 쓸것
		
		System.out.println("2단부터 9단까지 전체를 중복없이 배열로 출력합니다.");
		
		int[] array2 = new int[9];
		
		for(int i=0; i<8; i++) {
			for(int j=1; j<10; j++) {
				array2[i] = (i+2) * j;
				System.out.println(array2[i]);
			}
		}
		
		
	}

}
