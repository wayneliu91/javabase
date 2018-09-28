package com.repose.java.lang.annotation;

import com.repose.annotations.UseCase;
import com.repose.util.PasswordUtils;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 11629
 */
public class UseCaseTrackerTest {

    @Test
    public void annotationTest() {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }

    private static void trackUseCases(List<Integer> useCases, Class<?> clazz) {
        // 遍历每个方法上的注解
        for (Method method : clazz.getDeclaredMethods()) {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("发现使用的UseCase注解: " + useCase.id() + " " + useCase.description());
                useCases.remove(new Integer(useCase.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: 丢失UseCase注解-" + i);
        }
    }

}
