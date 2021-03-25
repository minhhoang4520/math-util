/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bin.test;

import com.bin.MathUtility;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Minh Hoang
 */
public class MathUtilityTest {
    @Test // biến hàm này thành main dùng shift+f6 để chạy
    // Gọi hmf getF như thường lệ , hay hơn là tự động so sánh giumg expected vs actual coi có khớp nhau không ?? có thấy màu xanh không thấy máu đoy.
    // Ta chỉ nhìn mày mà không cần mất công so sánh nữa!!!!
    public void testFactorialRightArgumentRunsWell() {
         long expected=120;// em muốn biết 5! đúng bằng 120 k
         int n=5;
         long actual= MathUtility.getFactorial(n);// tính thiệc coi
         // và so sánh giùm tớ luôn
        assertEquals(actual, expected);// tớ chỉ thích biển báo giao thông
    }
}
