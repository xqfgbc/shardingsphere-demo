package com.bo.shardingspheredemo;

import com.bo.shardingspheredemo.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.google.common.collect.Lists.newArrayList;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/shops/{shopId}/orders")
@RequiredArgsConstructor
public class OrderController {

    @GetMapping
    List<Order> getOrders(@PathVariable("shopId") String shopId) {
        final Date now = new Date();
        return newArrayList(Order.builder()
                .id(123L)
                .orderNo("qwe124")
                .shopId("taobao1")
                .customerId(1L)
                .customerName("zhangsan")
                .createdTime(now)
                .updatedTime(now)
                .build());
    }
}
