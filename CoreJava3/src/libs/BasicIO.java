package libs;

/**
 *Taking input from keyboard using user defined method
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicIO
{
        public static String readString() throws Exception{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String tmp = br.readLine();
            return(tmp);
        }
        
         public static boolean readBoolean() throws Exception{                         
             String tmp = readString(); 
             return(Boolean.parseBoolean(tmp));
        }
        
        public static byte readByte() throws Exception{            
            String tmp = readString();
            return(Byte.parseByte(tmp));
        }
        
        public static short readShort() throws Exception{           
            String tmp = readString();
            return(Byte.parseByte(tmp));
        }
        
        public static int readInteger() throws Exception{            
            String tmp = readString();
            return(Integer.parseInt(tmp));
        }
            
        public static long readLong() throws Exception{            
            String tmp = readString();
            return(Long.parseLong(tmp));
        }
        
        public static double readDouble() throws Exception{            
            String tmp = readString();
            return(Double.parseDouble(tmp));
        }
        
        public static float readFloat() throws Exception{            
            String tmp = readString();
            return(Float.parseFloat(tmp));
        }
    }