package kr.co.array;

public class ArrayTest06 {
	public static void main(String[] args) {
		/* 100��¥�� 1���� �迭�� �����ϰ�
		 * for���� �̿��Ͽ� 1~100������ 100���� ���� �Է��ϰ�
		 * �Էµ� �迭�� ���� ���ϱ�
		 */
		int sum = 0;
		int evenSum = 0;
		int[] intArr = new int[100];
		
		for(int i=1;i<intArr.length+1;i++) {
			intArr[i-1]=i;
			sum += intArr[i-1];
		}
		
		System.out.println("sum: "+sum);
		
//		�迭�� ���� ¦���� ����� ��
		for(int i=0;i<intArr.length;i++) {
			if(intArr[i]%2==0) {
				evenSum+=intArr[i];
			}
		}
		System.out.println("evenSum: "+evenSum);
	}
}
