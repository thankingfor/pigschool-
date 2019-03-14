package com.pigschool.xyzshow.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * @author lyf
 * @create 2019-03-02 12:33
 */
public class BzsyUtils {

    /**
     * 是否为空，对象为空返回true
     * @param obj
     * @return
     */
    public static boolean isNull(Object obj){
        return obj == null;
    }

    /**
     * 是否不为空，对象不为空返回true
     * @param obj
     * @return
     */
    public static boolean isNotNull(Object obj){
        return !isNull(obj);
    }

    /**
     * 是否为空，对象为空返回true
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj){
        if (obj == null) return true;
        else if (obj instanceof CharSequence) return ((CharSequence) obj).length() == 0;
        else if (obj instanceof Collection) return ((Collection) obj).isEmpty();
        else if (obj instanceof Map) return ((Map) obj).isEmpty();
        else if (obj.getClass().isArray()) return Array.getLength(obj) == 0;
        else if (obj instanceof String) {return obj == null || obj == "";}
        return false;
    }

    /**
     * 是否不为空，对象不为空返回true
     * @param obj
     * @return
     */
    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }
}
