package com.example.demo.enums;

import lombok.Getter;

/**
 * 自定义返回枚举
 */
@Getter
public enum ResultEnum {
  SESSION_NOT_EXISTS(403, "session 不存在"),
  SUCCESS(0, "成功"),

  PARAM_ERROR(1, "参数不正确"),

  NOT_EMPTY(2, "参数不能为空"),
  FILE_SYNCHRONIZING(10001, "附件同步中"),
  FILE_START_SYNCING(10002, "附件开始同步"),

  REQUEST_ERROR(3, "请求错误"),
  FJ_ERROR(90, "该附件已撤回"),
  CLIENT_ERROR(4, "客户端请求错误"),
  PARSE_ERROR(5, "类型转换错误"),

  ILLEGAL_PARAMS(400, "请求参数错误"),
  NOT_FOUND(404, "请求路径不对"),
  REQUEST_TIMEOUT(408, "请求超时"),
  INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
  UPTFTP_FAILED(1601, "文件尚未同步完成，请重新点击查看");

  private Integer code;

  private String message;

  ResultEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }
}
