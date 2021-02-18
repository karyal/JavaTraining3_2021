package libs;
/**
 * Write a description of class BasicIOV2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasicIOV2
{
   public static void printMessage(String msg){
       System.out.print(msg);
   }
   public static void printMessage(String label, int value){
       System.out.print(label +" : "+value);
   }
   public static void newLine(){
       System.out.println();
   }
}
