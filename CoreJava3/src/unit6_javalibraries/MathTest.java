package unit6_javalibraries;

public class MathTest {

	public static void main(String[] args) {
		//static int	abs(int a)
		//static int	absExact(int a)
		
		int num1 = -95885;
		System.out.println(Math.abs(num1));
		
		//static double	ceil(double a)
		//static double	floor(double a)
		
		double dn1 = 9856.11;
		System.out.println(Math.floor(dn1));
		System.out.println(Math.ceil(dn1));
		
		//static double	exp(double a)
		double dn2 = 3;
		System.out.println(Math.exp(dn2));
	
		//static int	max(int a, int b)
		//static int	min(int a, int b)
		
		int min = Math.min(30, 21);
		int max = Math.min(3, 21);
		System.out.println(min+", "+max);
	
		//static double	pow(double a, double b)
		//static double	random()
		//static long	round(double a)
		//static double	sqrt(double a)
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.random()*100);
		double dn3 = 123.64;		
		System.out.println(Math.round(dn3));
		System.out.println(Math.sqrt(16));
		
	}

}
