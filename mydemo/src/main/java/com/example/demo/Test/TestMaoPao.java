package com.example.demo.Test;

import java.util.Arrays;

/**
 * @author xuhuan
 * @date 2020/06/04
 */
public class TestMaoPao {

  public static void main(String[] args) {
    int a[] = {1, 22, 3, 41, 5, 6, 7};
    bubbleSort1(a, 7);
  }

  /**
   * 冒泡排序
   * @param a
   * @param n
   */
  public static void bubbleSort1(int[] a, int n) {
    int i, j;
    for (i = 0; i < n; i++) {//表示 n 次排序过程。
      for (j = 1; j < n - i; j++) {
        if (a[j - 1] > a[j]) {//前面的数字大于后面的数字就交换 //交换 a[j-1]和 a[j]
          int temp;
          temp = a[j - 1];
          a[j - 1] = a[j];
          a[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(a));
  }
}
