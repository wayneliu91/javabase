package com.repose;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.repose.entity.User;

/**
 * @author 刘山禾 2018年08月17日 新建
 * @since JDK1.7
 */
public class TestFastJson {

    public static void main(String[] args) throws IOException {
        Map<String, List<User>> map = new HashMap<>();
        List<User> l1 = Lists.newArrayList(new User(1, "张三"), new User(2, "李四"));
        List<User> l2 = Lists.newArrayList(new User(3, "aa"), new User(4, "bb"));
        map.put("l1", l1);
        map.put("l2", l2);

        String jsonString = JSON.toJSONString(map);
        System.out.println(jsonString);

        ObjectMapper mapper = new ObjectMapper();
        Map<String, List<User>> readValue = mapper.readValue(jsonString,
                new TypeReference<Map<String, List<User>>>() {
                });
        List<User> l11 = readValue.get("l1");
        for (User user : l11) {
            System.out.println(JSON.toJSONString(user));
        }

        List<User> l21 = readValue.get("l2");
        for (User user : l21) {
            System.out.println(JSON.toJSONString(user));
        }
    }

    private static void jackSon() throws IOException {
        Map<String, List<User>> map = Maps.newHashMap();
        map.put("one", Lists.newArrayList(new User(1, "张三"), new User(2, "李四")));
        map.put("two", Lists.newArrayList(new User(3, "aa"), new User(4, "bb")));

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);

        Map<String, List<User>> jsonMapResult = mapper.readValue(json,new TypeReference< Map<String,List<User>>>() {});
        System.out.println("通过Jackson转换...");
        printType(jsonMapResult);
    }

    private static void printType(Map<String, List<User>> map) {
        for (Map.Entry<String, List<User>> entry : map.entrySet()) {
            System.out.println("key 类型:" + entry.getKey().getClass() + ", value类型:"
                    + entry.getValue().getClass() + ", List中元素类型" + entry.getValue().get(0).getClass());
        }
    }
}
