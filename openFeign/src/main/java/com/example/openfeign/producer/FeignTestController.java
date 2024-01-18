package com.example.openfeign.producer;

import com.example.openfeign.entity.Payment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class FeignTestController {

    @GetMapping("/selectPaymentList")
    public Payment selectPaymentList(@RequestParam int pageIndex, @RequestParam int pageSize) {
        System.out.println(pageIndex);
        System.out.println(pageSize);
        Payment payment = new Payment();
        return payment;
    }

    @GetMapping(value = "/selectPaymentListByQuery")
    public Payment selectPaymentListByQuery(Payment payment) {
        System.out.println(payment);
        return payment;
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public Payment create(@RequestBody Payment payment) {
        System.out.println(payment);
        return payment;
    }

    @GetMapping("/getPaymentById/{id}")
    public Payment getPaymentById(@PathVariable("id") String id) {
        System.out.println(id);
        return new Payment();
    }
}

