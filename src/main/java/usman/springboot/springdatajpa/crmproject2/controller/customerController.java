package usman.springboot.springdatajpa.crmproject2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import usman.springboot.springdatajpa.crmproject2.model.studentinfo;
import usman.springboot.springdatajpa.crmproject2.service.ICustomerService;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;

@Controller
public class customerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("/savecustomer")
    public String savecustomerDetails(Model model)
    {
        List<studentinfo> studentinfoList = service.getCustomersInfo();
        model.addAttribute("studentinfo", studentinfoList);

        return "cxdetails";



    }
    @GetMapping("/showForm")
    public String getForm(Map<String, Object> model)
    {
        studentinfo c=new studentinfo();
        model.put("student", c);
        return "showform";

    }

    @PostMapping("/registerCustomer")
    public String registerCx(@ModelAttribute("student")studentinfo st, Map<String, Object> model)
    {

        service.saveCustomerDetails(st);
        return "redirect:/savecustomer";


    }
    @GetMapping("/updateForm")
    public String updateCxInfo(@RequestParam("customerId")Integer id, Map<String, Object> model)
    {
        System.out.println("update form ");
        studentinfo cx = service.fetchCxById(id);
        System.out.println(cx);
        model.put("student", cx);
        return "showform";
    }

    @GetMapping("/deleteData")
    public String deleteCx(@RequestParam("customerId")Integer id)
    {
        service.deleteCxById(id);
        return "redirect:/savecustomer";
    }
}
