package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.config.ConfigurationSettings;

@RestController
@RequestMapping(value = "/helloworld")
public class HelloWorldService {

    @Autowired
    private ConfigurationSettings configurationSettings;

    @RequestMapping(value = "")
    public String getGreeting() {
        return configurationSettings.getGreeting();
    }
    @RequestMapping(value = "/name")
    public String getName() {
        return configurationSettings.getName();
    }

}
