package com.zuniga.thymeleafchallenge.controllers;

import com.zuniga.thymeleafchallenge.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private static final List<Employee> employees = new ArrayList<>();

    static {
            employees.add(new Employee(UUID.randomUUID(), "Juan", "Perez", "Maitre"));
            employees.add(new Employee(UUID.randomUUID(), "Catalina", "La Grande", "Garzon"));
            employees.add(new Employee(UUID.randomUUID(), "John", "Doe", "Garzon"));
    }

    @GetMapping
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employees);

        return "staff";
    }
}
