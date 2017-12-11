package com.repose.guava.basicutilities;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

public class TestPreconditions {
    public static void main(String[] args) throws Exception {

        getPerson(8, "peida");

        getPerson(-9, "peida");

        getPerson(8, "");

        getPerson(8, null);

        getPersonByPrecondition(8,"peida");

        try {
            getPersonByPrecondition(-9,"peida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8,"");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8,null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getPersonByPrecondition(int age,String name)throws Exception{
        Preconditions.checkNotNull(name, "name为null");
        Preconditions.checkArgument(name.length()>0, "name为\'\'");
        Preconditions.checkArgument(age>0, "age 必须大于0");
        System.out.println("a person age:"+age+",name:"+name);
    }

    private static void getPerson(int age, String name) throws Exception {
        if (age > 0 && name != null && StringUtils.isNoneBlank(name)) {
            System.out.println("a person age:" + age + ",name:" + name);
        } else {
            System.out.println("参数输入有误！");
        }
    }
}
