package com.rider.driver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Value("${local.server.port}")
    private int port;

    @GetMapping("/available")
    public String getDrivers() {
        System.out.println("Request handled by DRIVER-SERVICE on port " + port);
        return "Driver list from instance running on port " + port;
    }
}
