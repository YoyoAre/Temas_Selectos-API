package com.proyecto_apis.t2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controlador_home {
    @GetMapping("/pato")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") 
    String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
    
}