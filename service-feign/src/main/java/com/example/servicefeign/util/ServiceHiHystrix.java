package com.example.servicefeign.util;

import com.example.servicefeign.service.ServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements ServiceHi {

    @Override
    public String sayHiFromServiceHi(String name) {
        return "hello" + name + ", this message send failed";
    }
}
