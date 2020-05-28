package com.example.demo.Test;

import com.example.demo.entity.Animal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xuhuan
 * @date 2020/05/26
 */
public class Test {


  public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<Animal>();
    Animal animal1 = new Animal("1", "猫");
    Animal animal2 = new Animal("2", "兔子");
    Animal animal3 = new Animal("3", "袋鼠");
    Animal animal4 = new Animal("3", "袋鼠");
    Animal animal5 = new Animal("4", "狗");
    animalList.add(animal2);
    animalList.add(animal1);
    animalList.add(animal3);
    animalList.add(animal4);
    animalList.add(animal5);
    //去掉ID为4的实体
    animalList.removeIf(s -> s.getId().equals("4"));
    System.out.println("animalList = " + animalList);
    System.out.println("---------------");


    //根据ID进行排序
    List<Animal> animalList1 = animalList.stream()
        .sorted(Comparator.comparing(Animal::getId))
        .collect(Collectors.toList());
    System.out.println("animalList1 = " + animalList1);
    System.out.println("---------------");


    //取出NAME作为新的list
    List<String> animalIdList1 = animalList1.stream()
        .map(Animal::getName)
        .collect(Collectors.toList());
    animalIdList1.forEach(s -> System.out.print("NAME = " + s + " "));
    System.out.println("\n---------------");


    //提取ID 并对ID去重
    List<String> animalIdList2 = animalList1.stream()
        .map(Animal::getId).distinct()
        .collect(Collectors.toList());
    animalIdList2.forEach(s -> System.out.print("ID = " + s + " "));


    Map<String, Object> map = new HashMap<String, Object>();
    map.put("name", "ZK");
    map.put("age", 13);


    Map<String, Object> map2 = new HashMap<String, Object>();
    map2.put("name", "ZA");
    map2.put("age", 15);


    Map<String, Object> map3 = new HashMap<String, Object>();
    map3.put("name", "CX");
    map3.put("age", 20);


    Map<String, Object> map4 = new HashMap<String, Object>();
    map4.put("name", "CX");
    map4.put("age", 18);


    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
    list.add(map);
    list.add(map2);
    list.add(map3);
    list.add(map4);


    // 排序代码如下
    List<Map<String, Object>> collect = list.stream()
        .sorted(Comparator.comparing(Test::comparingByName)
            .thenComparing(Comparator.comparing(Test::comparingByAge).reversed()))
        .collect(Collectors.toList());


    System.out.println(collect);


  }


  private static String comparingByName(Map<String, Object> map) {
    return (String) map.get("name");
  }


  private static Integer comparingByAge(Map<String, Object> map) {
    return (Integer) map.get("age");
  }
}
