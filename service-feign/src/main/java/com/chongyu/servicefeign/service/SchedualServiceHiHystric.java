package com.chongyu.servicefeign.service;

import com.chongyu.servicefeign.serviceInterface.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "(熔断器)sorry" + name;
    }
}
