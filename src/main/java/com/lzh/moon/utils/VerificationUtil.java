package com.lzh.moon.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 手机号码验证
 *
 * @author GideonYeung
 */
public class VerificationUtil {


    public static boolean isMobileNO(String mobiles) {
        //Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9])|(14[5,7])| (17[0,1,3,5-8]))\\d{8}$");
        String suffix ="^(1([345789]))\\d{9}$";
        Pattern p = Pattern.compile(suffix);
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
}
