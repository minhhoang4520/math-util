/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import com.bin.MathUtility;
/**
 *
 * @author Minh Hoang
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
//    System.out.println("1st upload from Local to Github");
//    System.out.println("Welcome to Github");
        
        //TEST TRÂU BÒ, NHING BẰNG MẮT
      long expected = 120;// Tôi kì vọng hàm tính giai thừa trả về 120
        long actual;      //nếu tui đưa vào 5
        int input = 5;
        actual = MathUtility.getFactorial(input);
        System.out.println("Expected: " + expected + " Actual: " + actual);
        // một test case, 1 tình huống xài hàm , test hàm, dùng hàm
        // case 2:0! thì sao>
        expected=1;
        input=0;
        actual = MathUtility.getFactorial(input);
        System.out.println("Expected: " + expected + " Actual: " + actual);
        // case 3:2! thì sao>
        expected=2;
        input=2;
        actual = MathUtility.getFactorial(input);
        System.out.println("Expected: " + expected + " Actual: " + actual);
        // case 4:-1! thì sao>
        //expected = ???? // ngoại lệ mà khoogn so sánh được, khon gphair value
      
        input=-1;
        actual = MathUtility.getFactorial(input);
        // chúng ta phải nhìn để kết luận 
        //nhiều case vậy thì dùng cách thông minh hơn
        
       
    }

}
