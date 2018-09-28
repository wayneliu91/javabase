package com.repose.java.lang.reflect;

import com.repose.entity.Car;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author 刘山禾 2018年08月26日 新建
 * @since JDK1.7
 */
public class ReflectTest {

    @Test
    public void test() throws Throwable {
        Car car = initByDefaultConst();
        System.out.println(car.toString());
    }

    private static Car initByDefaultConst() throws Throwable {
        // 类加载器加载Car类
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("com.repose.java.lang.reflect.Car");

        // 通过类的反射获取构造器，获取对象
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        Car car = (Car) constructor.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗CA72");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", Integer.class);
        setMaxSpeed.invoke(car, 200);
        return car;
    }

}
