package pk3;

public class ExplicitConversion {
	
	public static void main(String[] args) {
		
		int iNum=135; //32비트
		byte bNum=(byte)iNum; //8비트 -128 ~ 127
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum=1.2;
		float fNum=0.9f;
		
		
		int iNum1 = (int)(dNum + fNum);//2.1
		int iNum2=(int)dNum+(int)fNum;
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
