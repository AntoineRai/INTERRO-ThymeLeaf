package com.example.fullstackinterro.controller;

import com.example.fullstackinterro.model.Vacation;
import com.example.fullstackinterro.service.AbsenceService;
import com.example.fullstackinterro.service.EmployeeService;
import com.example.fullstackinterro.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AbsenceService absenceService;

    @Autowired
    private VacationService vacationService;
}