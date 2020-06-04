package com.example.demo.Test.algorithm;

/**
 * @author xuhuan
 * @date 2020/06/04
 */
public class TestEff {

  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7};
    int b = biSearch(a,9);
    System.out.println(b);
  }

  /**
   * 二分法查找
   * @param array
   * @param a
   * @return
   */
  public static int biSearch(int [] array,int a){
    int lo=0;
    int hi=array.length-1; int mid; while(lo<=hi){
      mid=(lo+hi)/2;//中间位置
      if(array[mid]==a){
        return mid+1;
      }else if(array[mid]<a){
        //向右查找
        lo=mid+1;
      }else{
        //向左查找
        hi=mid-1;
      }
    }
    return -1;
  }
}
