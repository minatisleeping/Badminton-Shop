
package util;

import java.util.Scanner;

/**
 *
 * @author minat
 */
public class FakeLibrarys {
    
    private static Scanner sc = new Scanner(System.in);

    public static int controlInteger(String inputMsg, String errorMsg) {
        
        int n;
        
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int controlInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound) {
        
        int n, tmp;
        
        if (lowerBound > upperBound) { // đổi chỗ
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerBound || n > upperBound)
                    throw new Exception();                
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập vào 1 số thực, chặn hết các trường hợp cà chớn 
    public static double controlDouble(String inputMsg, String errorMsg) {
        
        double n;
        
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
    public static double controlDouble(String inputMsg, String errorMsg, double lowerBound, double upperBound) {
        
        double n, tmp;
        
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if (n < lowerBound || n > upperBound)
                    throw new Exception();                
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
        
    
    public static String controlID(String inputMsg, String errorMsg, String format) {
        
        String id;
        boolean match;
        
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.length() == 0 || id.isEmpty() || match == false)
                System.out.println(errorMsg);
            else
                return id;            
        }
    }
    
    public static String controlString(String inputMsg, String errorMsg) {
        
        String id;    
        
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();            
            if (id.length() == 0 || id.isEmpty())
                System.out.println(errorMsg);
            else 
                return id;
        }
    }
}
