package com.thecoffeshop.controller;

import com.thecoffeshop.common.converter.EmployeeConverter;
import com.thecoffeshop.entity.*;
import com.thecoffeshop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    AtpositionService atpositionService;

    @Autowired
    BillService billService;

    @Autowired
    BilldetailService billdetailService;

    @Autowired
    BillstatusService billstatusService;

    @Autowired
    ImageService imageService;

    @Autowired
    ProductService productService;


    @GetMapping()
    public String getHome(){
        List<Product> products = productService.getListProductLimit(1,"1", "","");

        return "home";
    }
}
