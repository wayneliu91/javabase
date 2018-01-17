package com.repose.reflect;

/**
 * @author 11629
 */
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("创建 Candy 完成");
        try {
            Class.forName("com.repose.reflect.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到 Gum");
        }

        System.out.println("执行 Class.forName(\"Gum\") 完成");
        new Cookie();
        System.out.println("创建 Cookie 完成");
    }
}

class Candy {
    static {
        System.out.println("加载 Candy");
    }
}

class Gum {
    static {
        System.out.println("加载 Gum");
    }
}

class Cookie {
    static {
        System.out.println("加载 Cookie");
    }
}