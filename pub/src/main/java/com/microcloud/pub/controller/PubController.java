package com.microcloud.pub.controller;

import ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator;
import com.microcloud.pub.Config;
import com.microcloud.pub.bean.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubController {

    @Autowired
    Config config;

    @GetMapping("/properties")
    public AppProperties retrieveAppProperties(){
        return new AppProperties(config.getProp());
    }

}
