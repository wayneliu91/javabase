package com.repose.java.lang;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Ordering;
import com.repose.entity.Item;
import com.repose.entity.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试对象引用
 *
 * @author 刘山禾 2018年09月08日 新建
 * @since JDK1.7
 */
public class TestReference {

    @Test
    public void test() {
        referenceTest();
    }

    private static void referenceTest() {
        Order order = new Order();
        order.setOrderId("yj123");
        order.setValue(new BigDecimal(1000));

        List<Item> items = new ArrayList<>();
        Item item1 = new Item();
        item1.setId("i00001");
        item1.setName("item1");
        item1.setPrice(new BigDecimal(10));

        Item item2 = new Item();
        item2.setId("i00002");
        item2.setName("item2");
        item2.setPrice(new BigDecimal(20));

        Item item3 = new Item();
        item3.setId("i00003");
        item3.setName("item3");
        item3.setPrice(new BigDecimal(30));

        Item item4 = new Item();
        item4.setId("i00004");
        item4.setName("item4");
        item4.setPrice(new BigDecimal(40));

        items.add(item3);
        items.add(item1);
        items.add(item2);
        items.add(item4);

        order.setItems(items);

        print(order);

        System.out.println("====================");

        modifyItem(order);

        Ordering<Item> ordering = new Ordering<Item>() {
            @Override
            public int compare(Item item, Item t1) {
                return item.getPrice().subtract(t1.getPrice()).intValue();
            }
        };

        Collections.sort(order.getItems(), ordering);

        print(order);
    }

    private static void modifyItem(Order order) {
        List<Item> items = order.getItems();
        for (final Item item : items) {
            item.setName("测试");
        }
    }

    private static void print(Order order) {
        List<Item> items = order.getItems();
        for (Item item : items) {
            System.out.println(JSON.toJSONString(item));
        }
    }

}
