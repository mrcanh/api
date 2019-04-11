package com.vn.vsii.apitest.controller;

import com.vn.vsii.apitest.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TrangChuController {
    @Autowired
    private  ContactService contactService;
  @GetMapping
  public String View(Model model){
      model.addAttribute("contact",contactService.findAll());
      return "index";
  }
}
