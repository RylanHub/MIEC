package Lab6;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: May 8, 2022 12:59:05 PM	*/

public class Task3_BinarySearch {
	
	static int count = 0;

	public static void main(String[] args) {
		Scanner Bs = new Scanner(System.in);
		int x = Bs.nextInt();	//��Χ���
		int y = Bs.nextInt();	//�յ�
		int n = Bs.nextInt();	//����ֵ
		Bs.close();
		System.out.println(BinarySearch(x, y, n));
	}
	
	
	public static int BinarySearch(int x, int y, int n) {;
		int middle = (x+y)/2;
		
		if(middle==n) {
			count++;
			return count;
		}
		
		if(n<middle) {
			count++;
			return BinarySearch(x, middle, n);
		}else {
			count++;
			return BinarySearch(middle, y, n);
		}
	}

}
