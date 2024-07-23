package com.halan.orderms.factory;

import com.halan.orderms.listener.dto.OrderCreatedEvent;
import com.halan.orderms.listener.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent buildWithOneItem() {
        var items = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));

        return new OrderCreatedEvent(1L, 2L, List.of(items));
    }

    public static OrderCreatedEvent buildWithTwoItems() {
        var notebook = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));
        var desktop = new OrderItemEvent("desktop", 1, BigDecimal.valueOf(35.25));

        return new OrderCreatedEvent(1L, 2L, List.of(notebook, desktop));
    }
}
