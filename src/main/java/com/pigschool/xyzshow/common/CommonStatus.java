package com.pigschool.xyzshow.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lyf
 * @create 2019-03-02 13:50
 */

@Getter
@AllArgsConstructor
public enum  CommonStatus {

    USER_REGISTER_ACCOUNT_ISSET(1007,"账户已经被注册"),/*密码错误*/
    USER_PASSWORD_FAULT(1006,"密码错误"),/*密码错误*/
    USER_REGISTER_FAULT(1005,"注册失败"),/*注册失败*/
    USER_LOSE(1004,"用户不存在"),/*用户不存在*/
    USER_LOGIN_SUCCESS(1003,"登录成功"),/*登录成功*/
    USER_LOGIN_IDENTITY_EMPEY(1002,"用户身份不能为空"),/*用户身份不能为空*/
    USER_LOGIN_ACCOUNT_FAULT(1001,"账号或密码错误"),/*账号或密码错误*/
    EXCEPTION(3,"发成异常"),/*发成异常*/
    TOKEN_LOSE(2,"token失效"),/*登录凭证失效*/
    SUCCESS(1,"成功"),/*成功*/
    FAULT(0,"失败");/*失败*/

    private Integer status;
    private String text;

}
