package com.example.demo.Test.algorithm;

/**
 * 希尔排序
 * @author xuhuan
 * @date 2020/06/04
 */
public class TestXiErPx {

  private void shellSort(int[] a) {
    int dk = a.length / 2;
    while (dk >= 1) {
      ShellInsertSort(a, dk);
      dk = dk / 2;
    }
  }

  private void ShellInsertSort(int[] a, int dk) {
//类似插入排序，只是插入排序增量是 1，这里增量是 dk,把 1 换成 dk 就可以了
    for (int i = dk; i < a.length; i++) {
      if (a[i] < a[i - dk]) {
      }
    }
  }
}
