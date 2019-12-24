import java.util.Scanner;
public class Fruits {

	public static int s,t,per1,per2,j,d;
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите точку €блони");
		int a = sc.nextInt();
		
		System.out.println("¬ведите точку апельсина");
		int b = sc.nextInt();
		
		
		System.out.println("¬ведите границу €блони");
		 s = sc.nextInt();
		
		System.out.println("¬ведите границу апельсина");
		 t = sc.nextInt();
		
		
		System.out.println("¬ведите число упавших €блок");
		 per1 = sc.nextInt();
		int [] N =new int [per1];
		System.out.println("¬ведите €блоки");
		for (int i=0; i<per1;i++)
		{
			N[i]=sc.nextInt();	
		}
		
		System.out.println("¬ведите число упавших апельсинов");
		 per2 = sc.nextInt();
		int [] M =new int [per2];
		System.out.println("¬ведите  апельсины");
		for (int i=0; i<per2;i++)
		{
			M[i]=sc.nextInt();	
		}
		int pol = Orange.org( N,M);
		System.out.println("—только јпельсин может собрать Ќикадим "+d);
		System.out.println("—только яблок иможет собрать Ќикадим "+j);
	}
	}

