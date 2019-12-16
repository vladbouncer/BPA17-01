import java.util.Scanner;
public class Fruits {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите точку €блони");
		int a = sc.nextInt();
		
		System.out.println("¬ведите точку апельсина");
		int b = sc.nextInt();
		
		
		System.out.println("¬ведите границу €блони");
		int s = sc.nextInt();
		
		System.out.println("¬ведите границу апельсина");
		int t = sc.nextInt();
		
		
		System.out.println("¬ведите число упавших €блок");
		int per1 = sc.nextInt();
		int [] n =new int [per1];
		System.out.println("¬ведите €блоки");
		for (int i=0; i<per1;i++)
		{
			n[i]=sc.nextInt();	
		}
		
		System.out.println("¬ведите число упавших апельсинов");
		int per2 = sc.nextInt();
		int [] m =new int [per2];
		System.out.println("¬ведите  апельсины");
		for (int i=0; i<per2;i++)
		{
			m[i]=sc.nextInt();	
		}
		int d=0;//общее число €блок и апельсин которые собирает никодим
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
		System.out.println("—только €блок и апельсин может собрать Ќикадим "+d);
	}
	}

