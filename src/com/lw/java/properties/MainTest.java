package com.lw.java.properties;

import com.lw.java.annotation.MyAnnotation;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.Properties;

@MyAnnotation(test="asdfasdf", value=1, mock={"java", "nio"})
public class MainTest {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.load(new FileReader("src\\com\\lw\\java\\properties\\props.properties"));

        @SuppressWarnings("all")
        Enumeration keys = props.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = props.getProperty(key);
            System.out.println(key + "---" + value);
        }
    }
}
