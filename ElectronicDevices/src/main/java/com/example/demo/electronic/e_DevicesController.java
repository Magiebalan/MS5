package com.example.demo.electronic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class e_DevicesController {

    @Autowired
    private e_DevicesService service;

    @GetMapping("/Devices")
    public List<e_Devices> getDevices(){
        return service.getAllDevices();
    }

    @PostMapping("/Devices")
    public e_Devices saveDevices(@RequestBody e_Devices Devices) {
        return service.addDevices(Devices);
    }


}
