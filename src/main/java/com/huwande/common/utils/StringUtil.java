package com.huwande.common.utils;
/**
 * 
    * @ClassName: StringUtil
    * @Description: 编写自我的工具类
    * @author De.nnn
    * @date 2019年9月9日
    *
 */
public class StringUtil {
	public static String toHtml(String text){
		if(text.length()==10) {
			System.out.println("方法通过，手机号正确");
			return text;
		}
		return "";

		

}
}
