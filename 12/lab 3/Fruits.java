import java.util.Scanner;
public class Fruits {

	public static int s,t,per1,per2,j,d;
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("������� ����� ������");
		int a = sc.nextInt();
		
		System.out.println("������� ����� ���������");
		int b = sc.nextInt();
		
		
		System.out.println("������� ������� ������");
		 s = sc.nextInt();
		
		System.out.println("������� ������� ���������");
		 t = sc.nextInt();
		
		
		System.out.println("������� ����� ������� �����");
		 per1 = sc.nextInt();
		int [] N =new int [per1];
		System.out.println("������� ������");
		for (int i=0; i<per1;i++)
		{
			N[i]=sc.nextInt();	
		}
		
		System.out.println("������� ����� ������� ����������");
		 per2 = sc.nextInt();
		int [] M =new int [per2];
		System.out.println("�������  ���������");
		for (int i=0; i<per2;i++)
		{
			M[i]=sc.nextInt();	
		}
		int pol = Orange.org( N,M);
		System.out.println("������� �������� ����� ������� ������� "+d);
		System.out.println("������� ����� ������ ������� ������� "+j);
	}
	}

