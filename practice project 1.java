package practiceprograms;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 12;
		float b=a;
		short s= (short)a;
		byte f = (byte)s;
		System.out.println("Before typecasting :"+a);
		System.out.println("after implicit  typecasting :"+b);
		System.out.println("Afret explicit typecasting :"+f);

	}

}
