package com.robeil.limitmicroservices.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    private int minimum;
    private int maximum;
}
