package com.fu.mathutil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Tranh
 */
public class MathUtilLive {

    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);

        //MathUtil.getFactorial(-5); ném ngoại lệ thật rồi, ai biểu ddauw cá trớn làm chi
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));

        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 5:35PM 7/7/2021
        
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));

        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về cảu hàm là j
        //expected value: 5! = 120
        //mày/hàm ai đố viết khi chạy là mấy - actual, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
    }
}
