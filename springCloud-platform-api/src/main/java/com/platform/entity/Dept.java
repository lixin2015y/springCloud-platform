package com.platform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 实体类 使用lombok支持链式写法
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long deptId;
    private String dName;
    private String dbSource;
}
