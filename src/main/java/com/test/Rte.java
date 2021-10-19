package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * xxx
 *
 * @author 技惊四座
 * @date 2021-08-02 19:46
 */
public class Rte {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("jdbc:(?<db>\\w+):.*((//)|@)(?<host>.+):(?<port>\\d+).*/(?<dbname>\\w+)?.*");
        Matcher m = p.matcher("jdbc:mysql://127.0.0.1:3306/databaseName?tesdasdfgdsfgdg");
        if(m.find()) {
            System.out.println(m.group("db"));
            System.out.println(m.group("host"));
            System.out.println(m.group("port"));
            System.out.println(m.group("dbname"));
        }



        String str="jdbc:mysql://127.0.0.1:3306/databaseName?tesdasdfgdsfgdg";
        String substring = str.substring(str.indexOf("//")+2, str.indexOf("?"));
        String substring1 = substring.substring(substring.indexOf("/")+1);
        System.out.println(substring1);


    }

    private static void test() {
        System.out.println(1);
        return;
    }
}
