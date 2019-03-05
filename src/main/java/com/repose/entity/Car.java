package com.repose.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 刘山禾 2018年08月26日 新建
 * @since JDK1.7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Car {
    private String brand;

    private String color;

    private Integer maxSpeed =0;
}
