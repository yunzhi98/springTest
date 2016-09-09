package com.fell.ssm.util;

import com.fell.ssm.util.exception.CommonException;

import java.util.Collection;

/**
 * Created by wb-xuzhenbin on 2016/9/9.
 */
public class AssertUtil {

    /**
     * 验证是否为空
     * <p>为空是抛出异常</p>
     * @param validateMsg
     * @param errorMsg
     */
    public static void isBlank(String validateMsg, String errorMsg) {
        if (StringUtil.isBlank(validateMsg)) {
            throw new CommonException(errorMsg);
        }
    }

    /**
     * 验证是否为空
     * <p>为空是抛出异常</p>
     * @param validateObj
     * @param errorMsg
     */
    public static void isNull(Object validateObj, String errorMsg) {
        if (null == validateObj) {
            throw new CommonException(errorMsg);
        }
    }

    /**
     * 验证表达式是否为<code>true</code>
     * <p>表达式不为<code>true</code>时抛出异常</p>
     * @param exp
     * @param errorMsg
     */
    public static void isTrue(boolean exp, String errorMsg) {
        if (!exp) {
            throw new CommonException(errorMsg);
        }
    }

    /**
     * 验证是否为<code>0</code>
     * <p>表达式不为<code>0</code>时抛出异常</p>
     * @param exp
     * @param errorMsg
     */
    public static void isZero(int value, String errorMsg) {
        if (value != 0) {
            throw new CommonException(errorMsg);
        }
    }

    /**
     * 验证是否为<code>!0</code>
     * <p>表达式为<code>0</code>时抛出异常</p>
     * @param exp
     * @param errorMsg
     */
    public static void isNotZero(int value, String errorMsg) {
        if (value == 0) {
            throw new CommonException(errorMsg);
        }
    }

    /**
     * 验证容器是否不为空
     * <p>容器c为空时抛出异常</p>
     * @param c
     * @param errorMsg
     */
    public static <T> void isNotEmpty(Collection<T> c, String errorMsg) {
        if (c == null || c.isEmpty()) {
            throw new CommonException(errorMsg);
        }
    }

    /**
     * 判断对象不为空
     *
     * @param object
     */
    public static void notNull(Object object) {
        if (object == null) {
            throw new CommonException("对象为空");
        }
    }

    /**
     * 判断对象不为空
     *
     * @param object  对象
     * @param message 错误信息
     * @exception CommonException 如果对象为空
     */
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new CommonException(message);
        }
    }

}