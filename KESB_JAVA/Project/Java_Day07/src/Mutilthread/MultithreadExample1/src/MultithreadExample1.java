package Mutilthread.MultithreadExample1.src;

public class MultithreadExample1 {
	public static void main(String args[]) {
        Thread thread = new DigitThread();// �����带 ����   
        thread.start();     // �����带 ����
        for (char ch = 'A'; ch <= 'Z'; ch++) 
            System.out.print(ch);
    }
}
