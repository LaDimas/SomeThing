package com.parts.controller;

import com.parts.entity.Part;
import com.parts.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
    @RequestMapping("/")
    public class PartController {

    @Autowired
    public PartService partService;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/parts")
    public String getAllParts(Model model){
        model.addAttribute("parts", partService.findAll());
        return "partsList";
    }
    @GetMapping("/part/{name}")
        public String getByName(@PathVariable("name")String name, Model model){
        model.addAttribute("part", partService.getByName(name));
        return "showPart";
    }
    @GetMapping("/addPart")
    public String createPartPage(){
        return "createPart";
    }
    @PostMapping("/addPart")
        public String addPart(@ModelAttribute("part") Part part){
        partService.save(part);
        return "redirect:/parts";
    }
}
