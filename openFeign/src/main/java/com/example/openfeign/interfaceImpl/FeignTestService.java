package com.example.openfeign.interfaceImpl;

import com.example.openfeign.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "feignTestService", url = "http://localhost/8001")
public interface FeignTestService {

    @GetMapping(value = "/payment/selectPaymentList")
    Payment selectPaymentList(@RequestParam int pageIndex, @RequestParam int pageSize);

    @GetMapping(value = "/payment/selectPaymentListByQuery")
    Payment selectPaymentListByQuery(@SpringQueryMap Payment payment);

    @PostMapping(value = "/payment/create", consumes = "application/json")
    Payment create(@RequestBody Payment payment);

    @GetMapping("/payment/getPaymentById/{id}")
    Payment getPaymentById(@PathVariable("id") String id);
}

