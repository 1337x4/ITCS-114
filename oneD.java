import java.util.Scanner;

public class oneD {

   public static void rev(int[] ora, int j) 
    {
			int n = j;

			int[] temp = new int[n];


			System.out.print("Array1: ");
			for (int i = 0; i < temp.length; i++) 
			{
				System.out.print(" "+ora[i]);
				
			}
			System.out.println();

      for (int index = 0; index < temp.length; index++) 
	{
		temp[j-1] = ora[index];

		j--;
	}
			
	System.out.print("Array2: ");

	for (int i = 0; i < ora.length; i++) 
	{
				
		System.out.print(" "+temp[i]);
	}

    }

	public static void revstring(String[] ora, int j) 
    {
			int n = j;

			String[] temp = new String[n];


			System.out.print("Array1: ");
			for (int i = 0; i < temp.length; i++) 
			{
				System.out.print(" "+ora[i]);
				
			}
			System.out.println();

      for (int index = 0; index < temp.length; index++) 
	{
		temp[j-1] = ora[index];

		j--;
	}
			
	System.out.print("Array2: ");

	for (int i = 0; i < ora.length; i++) 
	{
				
		System.out.print(" "+temp[i]);
	}
	System.out.println();
    }

		
	public static void avgs(int[] ora) 
		{
			int sum = 0;
			double avg;

			for (int i = 0; i < ora.length; i++) 
			{
				sum = sum + ora[i];
			}

			avg = sum /ora.length;
			
			System.out.println();
			System.out.println("Average: "+avg);
			
		}

		public static void even(int[] ora) 
		{
			int k = 0;

			for (int i = 0; i < ora.length; i++) 
			{
				if (ora[i] % 2 == 0) 
				{
					k++;
				}
				else
				{

				}

			}
		
			System.out.print("Number of even numbers: "+k);
			System.out.println();
		
		}

		public static void odd(int[] ora) 
		{
			int z = 0;

			for (int i = 0; i < ora.length; i++) 
			{
				if (ora[i] % 2 == 0) 
				{
					
				}
				else
				{
					z++;
				}

			}
		
			System.out.print("Number of odd numbers: "+z);
			System.out.println();
		
		}

		public static void main(String[] args) throws Exception {;
        int[] ar = {1,2,3,7,6};
		String[] girls ={"zain", "aysha", "mariam"};
		String[] boys = {"ali", "khalid", "abbas"};

        Scanner kbd = new Scanner(System.in);

        
				rev(ar, ar.length);
				avgs(ar);
				even(ar);
				odd(ar);
				revstring(girls, girls.length);
				revstring(boys, boys.length);

       

        kbd.close();
        

        }
    }

