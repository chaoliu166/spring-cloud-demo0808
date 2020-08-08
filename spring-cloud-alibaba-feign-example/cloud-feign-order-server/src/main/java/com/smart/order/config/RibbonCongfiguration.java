package com.smart.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.checkerframework.checker.units.qual.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonCongfiguration {

    /**
     *相应时间越长 权重就越小
     * @return
     */
    @Bean
    public IRule iRule() {

        // return new RoundRobinRule()
        return new WeightedResponseTimeRule();
    }



}
