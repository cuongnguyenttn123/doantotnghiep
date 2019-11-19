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
@RequestMapping("/")
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


    @GetMapping()
    public String getHome(){
        List<Image> images = imageService.getListImageOfProduct("12");
        return "home";
    }
}
