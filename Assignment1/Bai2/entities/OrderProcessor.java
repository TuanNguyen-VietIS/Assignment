package bai2.service;

import bai2.entities.Customer;
import bai2.entities.Cart;
import bai2.message.MessageService;

public class OrderProcessor {
    private MessageService messageService;

    public OrderProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processOrder(Order order) {
        order.processOrder();
        messageService.sendConfirmation(order.getCustomer(), order.getCart());
    }
}