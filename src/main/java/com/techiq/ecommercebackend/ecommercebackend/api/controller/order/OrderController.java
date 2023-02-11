package com.techiq.ecommercebackend.ecommercebackend.api.controller.order;

import com.techiq.ecommercebackend.ecommercebackend.modal.LocalUser;
import com.techiq.ecommercebackend.ecommercebackend.modal.MyOrder;
import com.techiq.ecommercebackend.ecommercebackend.service.OrderService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<MyOrder> getOrders(@AuthenticationPrincipal LocalUser user) {
        return orderService.getOrders(user);
    }
}
