package com.shengsiyuan.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
public class MyTest27 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb", "username", "password");

    }
}
