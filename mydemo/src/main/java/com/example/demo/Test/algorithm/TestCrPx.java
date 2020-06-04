package com.example.demo.Test.algorithm;

import java.util.Arrays;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

/**
 * @author xuhuan
 * @date 2020/06/04
 */
public class TestCrPx {

  public static void main(String[] args) {
    int a[] = {5, 8, 1, 9, 5, 4, 10, 19};
    sort(a);
  }

  /**
   * 插入排序
   * @param arr
   */
  public static void sort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      //插入的数
      int insertVal = arr[i];
      //被插入的位置(准备和前一个数比较)
      int index = i - 1;
      //如果插入的数比被插入的数小
      while (index >= 0 && insertVal < arr[index]) {
        //将把 arr[index] 向后移动
        arr[index + 1] = arr[index];
        //让 index 向前移动
        index--;
      }
      //把插入的数放入合适位置
      arr[index + 1] = insertVal;
    }
    System.out.println(Arrays.toString(arr));
  }

}
