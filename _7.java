
public class _7 {

	public static void main(String[] args) {
		
//		������ ����� �迭�� ������ �� �迭�� ����� ����Ѵ�.
		
		int[] array1 = new int[9];
		int num = 7;
		
		for(int i=0; i<array1.length; i++) {
			array1[i] = num * (i + 1);
			System.out.println(array1[i]);
		}

		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
//		2�ܿ��� 9�ܱ��� ��ü�� ����ϴµ� ���� �ߺ� �ڵ尡 �߻��Ѵ�.
//		�ݺ����� ����� 2�ܰ� 9�ܿ� ���� �ߺ��� �����Ѵ�.
//		�迭�� �翬�� ����
		
		System.out.println("2�ܺ��� 9�ܱ��� ��ü�� �ߺ����� �迭�� ����մϴ�.");
		
		int[] array2 = new int[9];
		
		for(int i=0; i<8; i++) {
			for(int j=1; j<10; j++) {
				array2[i] = (i+2) * j;
				System.out.println(array2[i]);
			}
		}
		
		
	}

}
