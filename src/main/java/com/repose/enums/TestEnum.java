package com.repose.enums;

/**
 * @author 常清 2019年03月02日 新建
 * @since 0.0.1-SNAPSHOT
 */
public enum TestEnum {

    /**
     *
     */
    A1(0, "a1"),
    B1(1, "b1"),
    C1(2, "c1");

    private Integer key;

    private String value;

    TestEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public boolean isInTestEnum(int key) {
        return this.key == key;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }}
