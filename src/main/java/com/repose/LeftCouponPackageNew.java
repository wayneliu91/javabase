package com.repose;

import java.math.BigDecimal;

/**
 * @author 常清 2019年01月30日 新建
 * @since 0.0.1-SNAPSHOT
 */
public class LeftCouponPackageNew {
    /** 剩余个数 */
    private int remainSize;
    /** 剩余面额 */
    private BigDecimal remainValue;
    /** 最小面额 */
    private BigDecimal min;

    LeftCouponPackageNew(int remainSize, BigDecimal remainValue, BigDecimal min) {
        this.remainSize = remainSize;
        this.remainValue = remainValue;
        this.min = min;
    }

    public int getRemainSize() {
        return remainSize;
    }

    public void setRemainSize(int remainSize) {
        this.remainSize = remainSize;
    }

    public BigDecimal getRemainValue() {
        return remainValue;
    }

    public void setRemainValue(BigDecimal remainValue) {
        this.remainValue = remainValue;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }
}
