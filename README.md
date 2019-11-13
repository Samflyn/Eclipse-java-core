import java.util.Scanner;

 

class ArmstrongNumber

{

   public static void main(String args[])

   {

      int n, sum = 0, temp, remainder, digits = 0;

 

      Scanner in = new Scanner(System.in);

      System.out.println("Input a number to check if it is an Armstrong number");      

      n = in.nextInt();

 

      temp = n;

     

      // Count number of digits

     

      while (temp != 0) {

         digits++;

         temp = temp/10;

      }

 

      temp = n;

 

      while (temp != 0) {

         remainder = temp%10;

         sum = sum + power(remainder, digits);

         temp = temp/10;

      }

 

      if (n == sum)

         System.out.println(n + " is an Armstrong number.");

      else

         System.out.println(n + " isn't an Armstrong number.");        

   }

   

   static int power(int n, int r) {

      int c, p = 1;

 

      for (c = 1; c <= r; c++)

         p = p*n;

 

      return p;  

   }

}













class Singleton 
{ 

    // static variable single_instance of type Singleton 

    private static Singleton single_instance = null; 

  

    // variable of type String 

    public String s; 

  

    // private constructor restricted to this class itself 

    private Singleton() 

    { 

        s = "Hello I am a string part of Singleton class"; 

    } 

  

    // static method to create instance of Singleton class 

    public static Singleton getInstance() 

    { 

        if (single_instance == null) 

            single_instance = new Singleton(); 

  

        return single_instance; 

    } 
} 

  
// Driver Class 

class Main 
{ 

    public static void main(String args[]) 

    { 

        // instantiating Singleton class with variable x 

        Singleton x = Singleton.getInstance(); 

  

        // instantiating Singleton class with variable y 

        Singleton y = Singleton.getInstance(); 

  

        // instantiating Singleton class with variable z 

        Singleton z = Singleton.getInstance(); 

  

        // changing variable of instance x 

        x.s = (x.s).toUpperCase(); 

  

        System.out.println("String from x is " + x.s); 

        System.out.println("String from y is " + y.s); 

        System.out.println("String from z is " + z.s); 

        System.out.println("\n"); 

  

        // changing variable of instance z 

        z.s = (z.s).toLowerCase(); 

  

        System.out.println("String from x is " + x.s); 

        System.out.println("String from y is " + y.s); 

        System.out.println("String from z is " + z.s); 

    } 
} 











public class JavaStringSortWithOutStringApi {

	public static void main(String[] args) {

		String original = "JavaScan.com";
		int j = 0;
		char temp = 0;

		char[] chars = original.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			for (j = 0; j < chars.length; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}

		for (int k = 0; k < chars.length; k++) {
			System.out.println(chars[k]);
		}

	}
}
                /* ............... END












public class GFG { 

  

    // Function to print all the permutations of str 

    static void printPermutn(String str, String ans) 

    { 

  

        // If string is empty 

        if (str.length() == 0) { 

            System.out.print(ans + " "); 

            return; 

        } 

  

        for (int i = 0; i < str.length(); i++) { 

  

            // ith character of str 

            char ch = str.charAt(i); 

  

            // Rest of the string after excluding  

            // the ith character 

            String ros = str.substring(0, i) +  

                         str.substring(i + 1); 

  

            // Recurvise call 

            printPermutn(ros, ans + ch); 

        } 

    } 

  

    // Driver code 

    public static void main(String[] args) 

    { 

        String s = "abb"; 

        printPermutn(s, ""); 

    } 
} 









