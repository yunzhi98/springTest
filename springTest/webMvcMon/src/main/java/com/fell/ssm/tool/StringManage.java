package com.fell.ssm.tool;

/**
 * Created by wb-xuzhenbin on 2016/8/25.
 */
public class StringManage {
    public static boolean isNotNull(Object obj){
        boolean backBool = false;
        if(obj == null){
            return backBool;
        }
        if(!obj.equals("") || !obj.equals("null")){
            backBool = true;
        }
        return backBool;
    }
}
