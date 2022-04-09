package cn.glonk.api.service.impl;

import cn.glonk.api.domain.Payment;
import cn.glonk.api.mapper.PaymentMapper;
import cn.glonk.api.service.PaymentService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yang
 * @Date 2022/4/9 21:10
 * @Version 1.0
 */
@Slf4j
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public List<Payment> findALL() {
        log.info("========findALL======" + JSON.toJSONString(paymentMapper.findALL()));
        return paymentMapper.findALL();
    }
}
