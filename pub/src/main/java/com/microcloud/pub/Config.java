package com.microcloud.pub;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("pub")
public class Config {
    private int prop;

    public int getProp() {
        return prop;
    }

    public void setProp(int prop) {
        this.prop = prop;
    }
}
