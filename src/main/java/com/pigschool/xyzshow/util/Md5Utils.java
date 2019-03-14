package com.pigschool.xyzshow.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

public class Md5Utils {

    private static final Logger LOGGER = LoggerFactory.getLogger(Md5Utils.class);


    private static byte[] md5(String s) {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(s.getBytes("UTF-8"));
            byte[] messageDigest = algorithm.digest();
            return messageDigest;
        } catch (Exception e) {
            LOGGER.error("MD5 Error...", e);
        }
        return null;
    }

    private static final String toHex(byte hash[]) {
        if (hash == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer(hash.length * 2);
        int i;

        for (i = 0; i < hash.length; i++) {
            if ((hash[i] & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString(hash[i] & 0xff, 16));
        }
        return buf.toString();
    }

    public static String hash(String s) {
        try {
            return new String(toHex(md5(s)).getBytes("UTF-8"), "UTF-8");
        } catch (Exception e) {
            LOGGER.error("not supported charset...{}", e);
            return s;
        }
    }

    /**
     * 对密码按照用户名，密码，盐进行加密
     * @param username 用户名
     * @param password 密码
     * @param salt 盐
     * @return
     */
    public static String encryptPassword(String username, String password, String salt) {
        return Md5Utils.hash(username + password + salt);
    }

    /**
     * 对密码按照密码，盐进行加密
     * @param password 密码
     * @param salt 盐
     * @return
     */
    public static String encryptPassword(String password, String salt) {
        return Md5Utils.hash(password + salt);
    }

    /**
     * 对密码按照密码，盐进行加密，循环加密次数
     * @param password 密码
     * @param salt 盐
     * @param count 循环加密次数
     * @return
     */
    public static String encryptPassword(String password, String salt, Integer count) {
        String token = password + salt;
        for (Integer i = 0 ; i <= count ; i++){
            token = Md5Utils.hash(token);
        }
        return Md5Utils.hash(password + salt);
    }

}