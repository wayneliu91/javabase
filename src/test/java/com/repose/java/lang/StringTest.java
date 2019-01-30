package com.repose.java.lang;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Set;

/**
 * @author 刘山禾 2018年10月29日 新建
 * @since JDK1.7
 */
public class StringTest {


    @Test
    public void testLength() {
        Set<String> set = Sets.newHashSet("aaa","bbb","ccc");
        String join = StringUtils.join(set);
        System.out.println(join);
    }

    @Test
    public void trim() {
        String trim = StringUtils.trimToEmpty("ss s  bb cc");
        System.out.println(trim);
        String s = "ss 22  bb".replaceAll("\\s*", "");
        System.out.println(s);
    }
}
