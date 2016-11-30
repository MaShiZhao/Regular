package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

    /*
    心得：

    网址：http://baike.baidu.com/link?url=tI10mLFzZ1Lyvq6RSYnCa04je-A2WZKEGIX7BilnJHDSyqg91Gk--dcnaksPyoqr1-Apt2r6l59dYWBevefIpJEojE1X29zfDBofUHHmanDWoMTsmkTICV9b1hPTbz82s1xYPaMLhIzp0z8AWVdkEa

    基础语法 "^([]{})([]{})([]{})$"
    正则字符串 = "开始（[包含内容]{长度}）（[包含内容]{长度}）（[包含内容]{长度}）结束"

    \d 数字字符
    \D 非数字字符
    \w 包含下划线的任何单词字符

    *前面的子表达式的任意次数
    +子表达式>1的次数
    ？0次或者一次

    {n} 匹配确定的次数
    {n,} 匹配最少的n次
    {n,m} 最少匹配n次 最多匹配m次
    这跟上面有的是同步的

    {i} {i，j} 个数
    [a-z] 匹配的内容 有序的    [abc] 匹配的是abc 无序的

    ？跟在任何一个其它限制符的时候（ * + ？ {n} {n,} {n,m}） 时匹配是非贪婪的  默认是贪婪的 ；
    对于字符串“oooo”，“o+?”将匹配每个“o”即4次匹配，而“o+”将只匹配1次即匹配“oooo”。

     */

    public static void main(String args[]) {

        String str = "青云店镇[11dd4]1115103001北京日[ddd]杂[111]北[是是是]200米路西cpp80285135农药";
        subChinese(str);


    }

    //截取 [中文]并且中间文字是1到3个
    private static void subChinese(String str) {
        Pattern p = Pattern.compile("[\\[][(\\u4e00-\\u9fa5)]{1,3}[\\]]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            String result = m.group();
            System.out.println(result);
        }
    }


}
