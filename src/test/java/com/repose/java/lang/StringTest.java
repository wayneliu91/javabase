package com.repose.java.lang;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author 刘山禾 2018年10月29日 新建
 * @since JDK1.7
 */
public class StringTest {


    @Test
    public void testJson() {
        List<Integer> temp = Lists.newArrayList(1, 3, 4, 5);
        System.out.println(JSON.toJSONString(temp));
    }

    @Test
    public void subString() {
        String s = "1234567890";
        String substring = s.substring(0, 10);
        System.out.println(substring);
    }

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

    @Test
    public void StringBuilderTest() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        if (StringUtils.isBlank(sb)) {
            System.out.println("空的");
        }
    }
}
