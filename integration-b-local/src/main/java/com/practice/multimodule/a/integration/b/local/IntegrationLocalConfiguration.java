package com.practice.multimodule.a.integration.b.local;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice.multimodule.b")
public class IntegrationLocalConfiguration {


}
