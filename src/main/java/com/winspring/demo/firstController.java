package com.winspring.demo;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class firstController {
  @GetMapping("/enroll")
  public String showForm(Model model){
      User user = new User();
      model.addAttribute("user",user);

      List<String> studentClass = Arrays.asList("Undergrad", "Graduate");
      model.addAttribute("studentClass", studentClass);
      return "enrollmentForm";
  }  

}