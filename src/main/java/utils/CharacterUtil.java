package utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuan
 * @project sivf_client
 * @description 字符工具
 * @date 2020/6/24 16:26
 **/
public class CharacterUtil {

    public static final String CHINESE_UNICODE_REGEX = "[\\u4E00-\\u9FA5]";

    /**
     * 验证是否为汉字
     *
     * @param str
     * @return
     */
    public static boolean isChinese(String str) {
        boolean b = false;
        Pattern pattern = Pattern.compile(CHINESE_UNICODE_REGEX);
        Matcher m = pattern.matcher(str);
        if (m.find()) {
            return true;
        }
        return b;
    }

    /**
     * 获取汉字
     * @param name
     * @return
     */
    public static String getChinese(String name) {
        StringBuilder chinese = new StringBuilder();//汉字字符串
        for (int i = 0; i <= name.length() - 1; i++) {//遍历每个字符
            String w = name.substring(i, i + 1);
            if (isChinese(w)) {//验证是否是汉字
                chinese.append(w);
            }
        }
        return chinese.toString();
    }

    /**
     * 获取汉字首字母
     * @param chinese
     * @return
     */
    public static String getFirstSpell(String chinese) {
        // 用StringBuffer（字符串缓冲）来接收处理的数据
        StringBuffer sb = new StringBuffer();
        //字符串转换为字截数组
        char[] arr = chinese.toCharArray();
        //创建转换对象
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        //转换类型（大写or小写）
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //定义中文声调的输出格式
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < arr.length; i++) {
            //判断是否是汉子字符
            if (arr[i] > 128) {
                try {
                    // 提取汉字的首字母
                    String[] temp = PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat);
                    if (temp != null) {
                        sb.append(temp[0].charAt(0));
                    }
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                // 如果不是汉字字符，直接拼接
                sb.append(arr[i]);
            }
        }
        return sb.toString().replaceAll("\\W", "").trim();
    }

    /**
     * 汉字转拼音（全小写）
     * @param inputString
     * @return
     */
    public static String getPingYin(String inputString) {

        //创建转换对象
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        //转换类型（大写or小写）
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //定义中文声调的输出格式
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        //定义字符的输出格式
        format.setVCharType(HanyuPinyinVCharType.WITH_U_AND_COLON);

        //转换为字节数组
        char[] input = inputString.trim().toCharArray();
        // 用StringBuffer（字符串缓冲）来接收处理的数据
        StringBuffer output = new StringBuffer();

        try {
            for (int i = 0; i < input.length; i++) {
                //判断是否是一个汉子字符
                if (java.lang.Character.toString(input[i]).matches("[\\u4E00-\\u9FA5]+")) {
                    String[] temp = PinyinHelper.toHanyuPinyinStringArray(input[i], format);
                    output.append(temp[0]);
                } else {
                    // 如果不是汉字字符，直接拼接
                    output.append(java.lang.Character.toString(input[i]));
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    /**
     * 汉字转拼音（首字母大写）
     * @param chinese
     * @return
     */
    public static String getFullSpell(String chinese) {
        // 用StringBuffer（字符串缓冲）来接收处理的数据
        StringBuffer sb = new StringBuffer();
        //字符串转换字节数组
        char[] arr = chinese.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        //转换类型（大写or小写）
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //定义中文声调的输出格式
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        //定义字符的输出格式
        defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_U_AND_COLON);
        for (int i = 0; i < arr.length; i++) {
            //判断是否是汉子字符
            if (arr[i] > 128) {
                try {
                    sb.append(capitalize(PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat)[0]));
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                // 如果不是汉字字符，直接拼接
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    /**
     * 首字母大写
     * @param str
     * @return
     */
    public static String capitalize(String str) {
        char ch[];
        ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        String newString = new String(ch);
        return newString;
    }

}

