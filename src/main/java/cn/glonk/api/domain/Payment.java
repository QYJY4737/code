package cn.glonk.api.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author yang
 * @Date 2022/4/9 20:46
 * @Version 1.0
 */
@Data
public class Payment implements Serializable{

    private static final long serialVersionUID = 423763283311628245L;

    private Integer id;

    private String serial;
}
