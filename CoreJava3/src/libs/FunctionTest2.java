package libs;
/**
 * Paramtert to main method.
 *
 * @author (Krishna Aryal)
 * @version (V001)
 */

public class FunctionTest2
{
   public static void main(String []args){
       //System.out.println(args.length);//Number of Arguments
       int len = args.length;
       //System.out.println(len);
       for (int i=0; i<len; i++){
           System.out.println(args[i]);
       }
   }
}