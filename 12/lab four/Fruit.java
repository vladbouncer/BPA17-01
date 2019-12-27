import java.util.Scanner;
	public class Fruits {

		public static int s,t,per1,per2,j,d;
		
		public static void main (String[] args)
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Введите точку яблони");
			int a = sc.nextInt();
			
			System.out.println("Введите точку апельсина");
			int b = sc.nextInt();
			
			
			System.out.println("Введите границу яблони");
			 s = sc.nextInt();
			
			System.out.println("Введите границу апельсина");
			 t = sc.nextInt();
			
			
			System.out.println("Введите число упавших яблок");
			 per1 = sc.nextInt();
			int [] N =new int [per1];
			System.out.println("Введите яблоки");
			for (int i=0; i<per1;i++)
			{
				N[i]=sc.nextInt();	
			}
			
			System.out.println("Введите число упавших апельсинов");
			 per2 = sc.nextInt();
			int [] M =new int [per2];
			System.out.println("Введите  апельсины");
			for (int i=0; i<per2;i++)
			{
				M[i]=sc.nextInt();	
			}
			int pol = Orange.org( N,M);
			System.out.println("Столько Апельсин может собрать Никадим "+d);
			System.out.println("Столько Яблок иможет собрать Никадим "+j);
		
			Runnable run =()->{int poli= Orange.org( N,M);
			System.out.println("Столько Апельсин может собрать Никадим potoka "+Orange.d);
			System.out.println("Столько Яблок иможет собрать Никадим potoka "+Orange.j);
			};
			Thread t= new Thread(run);
			t.start();
			
		}

}

