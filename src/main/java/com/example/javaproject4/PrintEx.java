package com.example.javaproject4;


    public class PrintEx {
        public static void main(String[] args) {
            // 2 * 1 = 2
            // 2 * 2 = 4
            for (int i = 2; i < 10; i++) {
                for (int j = 1; j < 10; j++) {

                    System.out.printf("%d * %d = %d\n",i ,j ,i * j );
                }
            }
        }
    }

