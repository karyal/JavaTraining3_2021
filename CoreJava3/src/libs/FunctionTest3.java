package libs;
/**
 * Function Overloading
 *
 * @author (Krishna Aryal)
 * @version (V001)
 */

public class FunctionTest3
{
   //Function Overloading - Function Name - Same, Parameter list different   
   public static void f1(){
       System.out.println("Hello");
   }
   
   public static void f1(String msg){
       System.out.println(msg);
   }
   
   public static void f1(String label, String msg){
       System.out.println(label+" : "+msg);
   }
   public static void sum(int n1, int n2){
       System.out.println(n1+n2);
   }   
   public static void sum(float n1, float n2){
       System.out.println(n1+n2);
   }
   public static void sum(int n1, float n2){
       System.out.println(n1+n2);
   }  
   public static void sum(float n1, int n2){
       System.out.println(n1+n2);
   }
}