package libs;
/**
 * Functions Basics
 *
 * @author Krishna Aryal
 * @version V001
 */

public class FunctionTest
{
    //Function
    
    //a. No Return Type; No Parameter 
    public static void f1(){
        System.out.println("Hello from f1 function");
    }
    
    public static void f01(){
        System.out.println("Hello from f01 function");
    }

    //b. No Return Type; Parameterized 
    public static void f2(int var1){ //var1 -> Receiver | Placeholder -> Parameter(s)
        System.out.println(var1);
    }
    
    public static void f3(int var1, int var2){
        System.out.println(var1+", "+var2);
    }
    
    public static void f03(int var1, int var2, int var3){
        System.out.println(var1+", "+var2+", "+var3);
    }
    
    public static void f04(int id, String full_name, String contact_address){
        System.out.println(id+", "+full_name+", "+contact_address);
    }
    
    //c. Return Type; No Parameter
    public static int f5(){
        int n1=85;
        return(n1); //Return - Only Single Value (Type)
    }
    
    //d. Return Type; Parameterized
    public static int f6(int n1, int n2){
        int result = n1+n2;
        return (result);
    }
    public static int f7(int n1, int n2){        
        //validation?
        return (n1+n2);
    }
    
    public static void f8(){
        System.out.println("Hello from f8 function");
        f8();
    }
    
    public static void f9(int n){
        System.out.println(n);                
        f9(n+1);
    }
    
    public static int f10(int n){
        if (n<=1){
            return 1;
        }
        else{
            return n + f10(n-1);
        }        
    }
    
    public static void main(String []args){        
        int result = f10(5);
        System.out.println(result);
        
        /*
        f9(1);
        int a=8;
        int b=9;
        int c = f6(a, b);
        f2(c);
        
        
        int v1 = f5();
        v1 = v1+1;
        f2(v1);//Argument || Multiple Arguments - Accept
        
        f1();
        int n1; //Local variable of main function
        n1 = 25;
        //f2(); //Message | Value Passing Mechanism | 26 - Call /19 - Calling
        f2(n1); //Send value of n1 -> f2() function       
        f2(14); //Send value/variable -> Argument(s) -> Actual Argument        
        f3(15, 20);
        f03(58, 5, n1);
        
        int sn=1;
        String fn="Raj";
        String ca="KTM";        
        
        f04(sn, fn, ca);
        f04(1,"Krishna","Balaju");                
        
        f1();//Function Call
        f01();
        f1();
        f1();
        f01();        
        */       
    }
}