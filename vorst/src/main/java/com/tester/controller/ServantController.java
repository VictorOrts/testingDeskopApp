package com.tester.controller;

import com.tester.basic.Servant;
import com.tester.service.ServantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/servants")
public class ServantController {

    private ServantService servantService;

    public ServantController(ServantService servantService) {
        this.servantService = servantService;
    }

    @GetMapping
    public String getServants(Model model) {
        List<Servant> servants = servantService.getServants();
        model.addAttribute("servants", servants);
        return "servants";
    }

}
