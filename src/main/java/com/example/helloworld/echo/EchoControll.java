package com.example.helloworld.echo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("echo")
// public class EchoControll extends BaseController {
public class EchoControll {


    @ModelAttribute // (1)
    public EchoForm setUpEchoForm() {
        EchoForm form = new EchoForm();
        return form;
    }

    @RequestMapping // (2)
    public String index(Model model) {
        return "echo/index"; // (4)
    }

    @RequestMapping("hello")
//    public String hello(@Valid EchoForm form, BindingResult result, Model model) { // (1)
	public String Main_Method(@Valid EchoForm form, BindingResult result, Model model) { // (1)
        if (result.hasErrors()) { // (2)
            return "echo/index";
        }
        model.addAttribute("name", form.getName());
        model.addAttribute("name2", form.getName2());
        return "echo/hello";
    }

//	 public int compare(EchoDto obj1, EchoDto obj2) {
//
//		if(obj1.getStr1().compareTo(obj2.getStr1(1)){
//			return -1;
//		}else if(obj1.getStr1().compareTo(obj2.getStr1(1)).getStr1())){
//	      return 1;
//		}else{
//	      return 0;
//	 	}
//	}

}