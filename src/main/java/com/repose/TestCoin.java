package com.repose;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author 常清 2019年01月30日 新建
 * @since 0.0.1-SNAPSHOT
 */
public class TestCoin {


    public static void main(String[] args) {
        List<BigDecimal> couponShareListNew = getCouponShareListNew(new BigDecimal(String.valueOf(1.88)), 2, new BigDecimal(String.valueOf(0.01)), 0);
        for (BigDecimal bigDecimal : couponShareListNew) {
            System.out.println(bigDecimal);
        }
    }


    /**
     * 获取拆分后的面额列表(新版本云币金额支持小数点)
     *
     * @param couponMoney 总面额
     * @param people      分享人数
     * @param min         最小面额
     * @param shareMode   分享方式
     * @return 面额列表
     * @author 小枫 2018年08月01日 新建
     */
    public static List<BigDecimal> getCouponShareListNew(BigDecimal couponMoney, int people, BigDecimal min, int shareMode) {
        if (shareMode == 0) {
            return randomSplitNew(couponMoney, people, min);
        }
        if (shareMode == 1) {
            return avgSplitNew(couponMoney, people);
        }
        return Collections.emptyList();
    }

    /**
     * 拼手气云币面额列表(新版本云币金额支持小数点)
     *
     * @param couponMoney 总面额
     * @param people      总人数
     * @param min         最小面额
     * @return 拆分后的列表
     * @author 小枫 于2018年07月31日 新建
     */
    private static List<BigDecimal> randomSplitNew(BigDecimal couponMoney, int people, BigDecimal min) {
        List<BigDecimal> result = new ArrayList<>();
        LeftCouponPackageNew leftCouponPackageNew = new LeftCouponPackageNew(people, couponMoney, min);
        for (int i = 0; i < people; i++) {
            BigDecimal randomCoupon = getRandomCouponNew(leftCouponPackageNew);
            result.add(randomCoupon);
        }
        return result;
    }

    /**
     * 均包
     *
     * @param couponMoney 总面额
     * @param people      总人数
     * @return 拆分后的列表
     * @author 小枫 2018年08月01日 新建
     */
    private static List<BigDecimal> avgSplitNew(BigDecimal couponMoney, int people) {
        int money = couponMoney.multiply(new BigDecimal(100)).intValue();
        // 余数
        int remainder = money % people;

        // 平均值
        BigDecimal avg = couponMoney.divide(new BigDecimal(people), 2, BigDecimal.ROUND_DOWN);

        List<BigDecimal> result = new ArrayList<>(people);
        for (int i = 1; i <= people; i++) {
            if (i <= remainder) {
                result.add(avg.add(new BigDecimal(0.01 + "")));
            } else {
                result.add(avg);
            }
        }
        return result;
    }

    /**
     * 随机获取一个面额
     *
     * @param leftCouponPackageNew 工具类
     * @return 随机面额
     * @author 小枫 2018年08月01日 新建
     */
    private static BigDecimal getRandomCouponNew(LeftCouponPackageNew leftCouponPackageNew) {
        //剩余个数
        int remainSize = leftCouponPackageNew.getRemainSize();
        //剩余金额
        BigDecimal remainValue = leftCouponPackageNew.getRemainValue();
        //最小
        BigDecimal min = leftCouponPackageNew.getMin();
        if (remainSize == 1) {
            leftCouponPackageNew.setRemainSize(remainSize - 1);
            return remainValue;
        }
        // 剩余平均值(直接保留两位小数点、删除多余的小数) = 剩余面额 / 剩余个数
        BigDecimal leftAvg = remainValue.divide(new BigDecimal(remainSize), 2, BigDecimal.ROUND_DOWN);
        // 最大值 = 剩余平均值 * 2
        BigDecimal max = leftAvg.multiply(new BigDecimal(2));
        Random random = new Random();
        // 随机值
        int randomNumber = max.multiply(new BigDecimal(100)).intValue();
        int coupon = random.nextInt(randomNumber);
        BigDecimal money = new BigDecimal(coupon).divide(new BigDecimal(100));
        int count = money.compareTo(min);
        BigDecimal couponMoney = count <= 0 ? min : money;
        leftCouponPackageNew.setRemainSize(remainSize - 1);
        BigDecimal value = remainValue.subtract(couponMoney);
        leftCouponPackageNew.setRemainValue(value);
        return couponMoney;
    }
}
