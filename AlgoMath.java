import java.util.Random;

public class AlgoMath {
	
	public void testMath() {
		
		// ���밪 ���ϱ�
		int a = Math.abs(-123);
		// �ݿø�
		long b = Math.round(123.5);
		// �ø�
		double c = Math.ceil(343.12345);
		// ����
		double d = Math.floor(3213.123);
		
		// 0���� ũ�ų� ���� 1���� ���� �Ǽ��� ���Ƿ� return
		Math.random();
		// 0~99 ������ ���� �� return
		double ab =Math.random() * 100;
		
		// Random �Լ��� �̿� �Ͽ� ������ ����
		Random random = new Random();
		
		// 1���� 100������ ������ ���� ��������
		random.nextInt(100); // 0~99 ������ ���� ����
		int r = random.nextInt(100)+1;
	}

}