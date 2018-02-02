package com.troy.springcloud.feign.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Created by Troy on 2018/2/1 22:12
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFromFeignClient(String name) {
        return "sorry, " + name + ", error!";
    }
}
