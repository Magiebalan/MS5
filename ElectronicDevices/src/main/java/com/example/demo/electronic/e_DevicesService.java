package com.example.demo.electronic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class e_DevicesService {

    @Autowired
    private e_DevicesRepository repository;


    public e_Devices addDevices(e_Devices Devices) {
        return repository.save(Devices);
    }

    public List<e_Devices> getAllDevices() {
        return repository.findAll();
    }

}
