package com.sdsoon.service;


import com.sdsoon.model.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created By Chr on 2019/3/9/0009.
 */
@Component
public interface OrderService {

    List<Order> queryOrder();
}
