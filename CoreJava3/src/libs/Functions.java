package libs;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creating user defined functions
 *
 * @author Krishna
 * @version V001
 */
import libs.BasicIO;
public class Functions
{
    public static void print_array(int []array1){
        for(int i = 0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
    }
    //read_array(3)
    public static int[] read_array(int MAX) throws Exception{
        int nums[] = new int[MAX];
        for(int i = 0; i<MAX; i++){
            System.out.print("Enter number "+(i+1)+" : ");
            nums[i]= BasicIO.readInteger();
        }
        return(nums);
    }   
    //get_sum(mynums) [5, 4, 3]
    public static int get_sum(int []nums){
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        return sum;
    }
    
    public static int get_max(int []nums){
        //int max=nums[0];
        int max = Integer.MIN_VALUE; //Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>=max){
               max = nums[i];
            }
        }
        return max;
    }
    
    // 2, 5, 1, 3, 0    
    public static int get_min(int []nums){
        int min=nums[0]; //2        
        for(int i=1; i<nums.length; i++){
            if(nums[i]<=min){
               min = nums[i]; 
            }
        }
        return min;
    }
    
    public static boolean search_num(int []nums, int n){
        boolean result = false;
        for(int i=0; i<nums.length; i++){
            if (nums[i]==n){
                result = true;
                break;
            }
        }
        return result;
    }
    
    public static void sort_nums(int []nums){        
        for(int i=0; i<nums.length-1; i++){
            if (nums[i]>nums[i+1]){
                int tmp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1] = tmp;
            }
        }
    }
    
    public static String convertTime(long time){
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        return format.format(date);
    }
}