package com.purejoy.musicshareroom.server.common.enums;

public enum CustomizeStatusEnum {

    SUCCESS_CODE(1000,"请求成功"),

    UNLOGIN_CODE(1001,"用户未登录"),

    UNRECOGNIZED_USER(1002,"未找到该用户"),

    DUPLICATE_USER_NAME(1003,"用户名重复"),

    DUPLICATE_MOBILE(1004,"手机号重复"),

    USERNAME_ERROR(1005,"用户名错误"),

    PASSWORD_ERROR(1006,"密码错误"),

    CODE_ERROR(600,"操作出现异常"),

    QUESTION_NOT_FOUND(2001,"房间没有找到，再确认下你的地址"),

    COMMENT_NOT_FOUND(2002,"回复的对象未找到"),

    TAG_EXISTS(2003,"房间已存在"),

    HOT_RANK_ERROR(2004,"侧边栏热门歌曲显示失败"),

    NOTHING_TO_SAVE(2005,"无需保存"),

    UPLOAD_ERROR(3001,"上传失败"),

    ERROR_MESSAGE_TYPE(4001, "错误的信息类型，仅支持文本格式" );

    private Integer statusCode;
    private String msg;

    CustomizeStatusEnum(Integer code, String msg) {
        this.statusCode = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return statusCode;
    }

    public String getMsg(){
        return msg;
    }

}
