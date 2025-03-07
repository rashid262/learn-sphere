package com.learnSphere.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Controller
public class OrderCreation {

    @Value("${razorpay.key_id}")
    private String razorpayKeyId;

    @Value("${razorpay.key_secret}")
    private String razorpayKeySecret;

    @PostMapping("/createOrder")
    @ResponseBody
    public String createOrder(@RequestParam("amount") int amount) {
        try {
            RazorpayClient razorpay = new RazorpayClient("rzp_test_tePWgTLBR6KdpL", "P07dQ0FvqmQjvhcR8N9W");

            JSONObject orderRequest = new JSONObject();
            orderRequest.put("amount", amount * 100); // amount in the smallest currency unit
            orderRequest.put("currency", "INR");
            orderRequest.put("receipt", "order_rcptid_" + System.currentTimeMillis());

            Order order = razorpay.orders.create(orderRequest);
            return order.toString();
        } catch (RazorpayException e) {
            e.printStackTrace();
            return "{\"error\":\"Unable to create order\"}";
        }
    }
}
