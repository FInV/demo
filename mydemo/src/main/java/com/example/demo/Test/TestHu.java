package com.example.demo.Test;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.file.FileReader;
import java.util.Date;

/**
 * @author xuhuan
 * @date 2021/02/25
 */
public class TestHu {

  public static void main(String[] args) throws Exception{
    String dateStr = "2017-03-01";
    Date date = DateUtil.parse(dateStr);

//结果 2017/03/01
    String format = DateUtil.format(date, "yyyy/MM/dd");

//常用格式的格式化，结果：2017-03-01
    String formatDate = DateUtil.formatDate(date);

//结果：2017-03-01 00:00:00
    String formatDateTime = DateUtil.formatDateTime(date);

//结果：00:00:00
    String formatTime = DateUtil.formatTime(date);
  }
}
