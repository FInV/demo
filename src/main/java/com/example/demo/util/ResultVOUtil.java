package com.example.demo.util;

import com.example.demo.VO.ResultVO;
import com.example.demo.enums.ResultEnum;

/**
 * http返回结果封装接口
 */
public class ResultVOUtil {

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static ResultVO success(Object object) {
    ResultVO resultVO = new ResultVO();
    resultVO.setData(object);
    resultVO.setCode(0);
    resultVO.setMsg("成功");
    return resultVO;
  }

  @SuppressWarnings("rawtypes")
  public static ResultVO success() {
    return success(null);
  }

  @SuppressWarnings("rawtypes")
  public static ResultVO error(Integer code, String msg) {
    ResultVO resultVO = new ResultVO();
    resultVO.setCode(code);
    resultVO.setMsg(msg);
    return resultVO;
  }

  @SuppressWarnings("rawtypes")
  public static ResultVO error(ResultEnum resultEnum) {
    ResultVO resultVO = new ResultVO();
    resultVO.setCode(resultEnum.getCode());
    resultVO.setMsg(resultEnum.getMessage());
    return resultVO;
  }
}
