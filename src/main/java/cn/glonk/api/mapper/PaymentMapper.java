package cn.glonk.api.mapper;

import cn.glonk.api.domain.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author yang
 * @Date 2022/4/9 20:54
 * @Version 1.0
 */
@Repository
@Mapper
public interface PaymentMapper {

    List<Payment> findALL();

}
