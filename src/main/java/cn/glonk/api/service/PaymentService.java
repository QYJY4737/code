package cn.glonk.api.service;

import cn.glonk.api.domain.Payment;

import java.util.List;

/**
 * @Author yang
 * @Date 2022/4/9 21:10
 * @Version 1.0
 */
public interface PaymentService {

    List<Payment> findALL();
}
