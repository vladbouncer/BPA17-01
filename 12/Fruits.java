import java.util.Scanner;
public class Fruits {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("������� ����� ������");
		int a = sc.nextInt();
		
		System.out.println("������� ����� ���������");
		int b = sc.nextInt();
		
		
		System.out.println("������� ������� ������");
		int s = sc.nextInt();
		
		System.out.println("������� ������� ���������");
		int t = sc.nextInt();
		
		
		System.out.println("������� ����� ������� �����");
		int per1 = sc.nextInt();
		int [] n =new int [per1];
		System.out.println("������� ������");
		for (int i=0; i<per1;i++)
		{
			n[i]=sc.nextInt();	
		}
		
		System.out.println("������� ����� ������� ����������");
		int per2 = sc.nextInt();
		int [] m =new int [per2];
		System.out.println("�������  ���������");
		for (int i=0; i<per2;i++)
		{
			m[i]=sc.nextInt();	
		}
		int d=0;//����� ����� ����� � �������� ������� �������� �������
		for (int i=0; i<per1;i++)
		{
			if (n[i]>=t)
			{
				d=d+1;
			}
		}
		
		for (int i=0; i<per2;i++)
		{
			if (n[i]<=s)
			{
				d=d+1;
			}
		}
		System.out.println("������� ����� � �������� ����� ������� ������� "+d);
	}
	}

