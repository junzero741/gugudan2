import java.util.Scanner;

public class _5 {

	public static void main(String[] args) {
	
//		���ݱ��� 2 ~ 5�ܱ��� �����ϱ� ���� �ܼ�, �ݺ����� �۾��� ���Ҵ�.
//		�� ���� �ܼ�, �ݺ����� �۾��� ������ �ݺ����� Ȱ���� �����ϸ鼭 6�ܰ� 7���� �����Ѵ�.
		System.out.println("while������ ������ �����: ���� 6 Ȥ�� 7�� �Է��ϼ��� ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		
		int i = 1;
		while(i<10) {
			
			int result = value * i;
			i = i + 1;
			System.out.println(result);
			
		}
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		
		System.out.println("for������ ������ �����: ���� 6 Ȥ�� 7�� �Է��ϼ��� ");
		Scanner scanner2 = new Scanner(System.in);
		int value2 = scanner2.nextInt();
		
		for(int j=1; j<10; j++) {
			int result = value2 * j;
			System.out.println(result);
		}

		
		
		
	}

}
