package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 陈齐尧 on 2019/3/20.
 */
@Controller
public class StudentController {

    @RequestMapping("/message/go")
    public String goTest(){
        return "reach";
    }

    @RequestMapping("/message/detail/data={uname}")
    public String goDetail(@PathVariable("uname")String data, Model model){
        model.addAttribute("data",data);
        return "detail";
    }

    @RequestMapping(value = "/massage/report1", method = RequestMethod.GET)
    public String reportGet(@RequestParam("begin") String begin,@RequestParam("end") String end,Model model){
        model.addAttribute("begin",begin);
        model.addAttribute("end",end);
        model.addAttribute("formType","GET");
        return "report";
    }
}
