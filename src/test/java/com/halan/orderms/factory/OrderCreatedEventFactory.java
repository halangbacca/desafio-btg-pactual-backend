package com.halan.orderms.factory;

import com.halan.orderms.listener.dto.OrderCreatedEvent;
import com.halan.orderms.listener.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent build() {
        var items = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));

        return new OrderCreatedEvent(1L, 2L, List.of(items));
    }
}
