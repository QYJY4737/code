package cn.glonk.api.controller;

import cn.glonk.api.domain.Payment;
import cn.glonk.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yang
 * @Date 2022/4/9 21:11
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/findALL")
    public List<Payment> findALL(){
        return paymentService.findALL();
    }

}
