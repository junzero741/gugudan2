import java.util.Scanner;

public class _6 {

	public static void main(String[] args) {
		
//		����ڰ� �Է��� ���� ���� �ش��ϴ� ���� ����Ѵ�.
//		���� ��� ����ڰ� 8�̶�� ���ڸ� �Է��ϸ� 8�� ��ü�� ����� ����Ѵ�.
//		����ڰ� 2 �̻�, 9 ���ϰ� �ƴ� ���� �Է��ϴ� ��� "2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�."��� �޽����� ����Ѵ�.
		
		System.out.println("���� �Է��ϼ��� ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int result;
		
		if(input >= 2 && input <= 9) {
			for(int i=1; i<10; i++) {
				result = input * i;
				System.out.println(result);
			}
		}else {
			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
		}
		
		

	}

}
