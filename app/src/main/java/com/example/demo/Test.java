package com.example.demo;

public class Test {


    public void a() {





    }


    public static void main(String[] arges) {
        Test test = new Test();
        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        test.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }



    public void sort(int[] arr) {
        int tmp;
        for(int i = 1; i < arr.length; i++) {
            // 待插入数据
            tmp = arr[i];
            int j;
            for(j = i - 1; j >= 0; j--) {
                // 判断是否大于tmp，大于则后移一位
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            System.out.println(i+"===============i====j==========="+j);
            arr[j+1] = tmp;
        }
    }

}
