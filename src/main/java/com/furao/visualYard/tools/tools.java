package com.furao.visualYard.tools;

import java.util.*;

public class tools {

    public static String generateUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static List<String> split(String str , String split){
        List<String> result = new ArrayList<>();
        if(split.equals(",")||split.equals("，")){
            if(str.contains(",")){
                String[] str1 = str.split(",");
                for (String s : str1) {
                    String[] str2 = s.split("，");
                    result.addAll(Arrays.asList(str2));
                }
            }else{
                String[] str1 = str.split("，");
                result.addAll(Arrays.asList(str1));
            }
            return result;
        }
        return null;
    }


    public static boolean checkEmpty(Object obj){
        if (obj == null) {
            return true;
        } else if (obj instanceof String && (obj.equals("") || obj.equals("0"))) {
            return true;
        } else if (obj instanceof Number && ((Number) obj).doubleValue() == 0) {
            return true;
        } else if (obj instanceof Boolean && !((Boolean) obj)) {
            return true;
        } else if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
            return true;
        } else if (obj instanceof Map && ((Map) obj).isEmpty()) {
            return true;
        } else if (obj instanceof Object[] && ((Object[]) obj).length == 0) {
            return true;
        }
        return false;
    }
}
