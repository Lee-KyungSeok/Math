import java.util.Random;

public class AlgoMath {
	
	public void testMath() {
		
		// 절대값 구하기
		int a = Math.abs(-123);
		// 반올림
		long b = Math.round(123.5);
		// 올림
		double c = Math.ceil(343.12345);
		// 내림
		double d = Math.floor(3213.123);
		
		// 0보다 크거나 같고 1보다 작은 실수를 임의로 return
		Math.random();
		// 0~99 사이의 임의 값 return
		double ab =Math.random() * 100;
		
		// Random 함수를 이용 하여 랜덤값 추출
		Random random = new Random();
		
		// 1부터 100사이의 랜덤한 숫자 가져오기
		random.nextInt(100); // 0~99 사이의 정수 리턴
		int r = random.nextInt(100)+1;
	}

}