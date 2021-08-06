package com.example.blog;

import com.example.blog.data.Employee;
import com.example.blog.app.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {

    @Autowired
    private HelloService service;

    @GetMapping("/")
    public String blog(Model model)
    {
        model.addAttribute("title", "Blog");
        return "blog";
    }

    @PostMapping("/blog")
    public String postRequest(@RequestParam("text1") String str, Model model)
    {
        model.addAttribute("sample" , str );
        return "response";
    }

    @PostMapping("/dbresponse")
    public String postDBRequest(@RequestParam("employeeId") String id, Model model)
    {
        Employee emp = service.getEmployee(id);
        model.addAttribute("employee", emp);
        return "dbresponse";
    }
}
