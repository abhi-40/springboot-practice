package com.abhishek.Service_Class_Demo.repo;

import com.abhishek.Service_Class_Demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository
{
    public void save(Laptop lap)
    {
        System.out.println("Data Saved In Database.....");
    }
}
