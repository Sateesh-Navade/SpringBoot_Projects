package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController                //it is a Combination of @Controller and @ResponseBody
public class HomeController {
//	@GetMapping("/wellcome")
//	public String welcome() {
//		return "Wellcome To Spring Boot";
//	}
		
//	@RequestMapping("/wellcome")
	@GetMapping("/wellcome")
	public String welcome() {
		return "Wellcome To Spring Boot";
	}
	
	
	@PostMapping("/test")
	public String test() {
		return "Testing REST API";
	}
	
	@GetMapping("/sum")
	public String sum(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "Sum Of "+a +" & "+b +" is :"+(a+b);
	}
	@GetMapping("/diff")
	public String diff(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "Diffrence Of "+a +" & "+b +" is :"+(a-b);
	}
	@GetMapping("/product")
	public String product(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "product Of "+a +" & "+b +" is :"+(a*b);
	}
	@GetMapping("/quotient")
	public String quo(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "Sum Of "+a +" & "+b +" is :"+(a/b);
	}
	@GetMapping("/rem")
	public String rem(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "Reminder Of "+a +" & "+b +" is :"+(a%b);
	}
	
	@GetMapping("/small")
	public String small(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "Smallest Of "+a +" & "+b +" is :"+(a>b?b:a);
	}
	@GetMapping("/large")
	public String large(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "Largest Of "+a +" & "+b +" is :"+(a<b?b:a);
	}
	@GetMapping("/hcf")
	public String hcf(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		for (int i = 1; i <= a || i<=b; i++) {
			if(a%i==0&&b%i==0)
				return "HCF Of "+a +" & "+b +" is :"+i;		
		}
		return null;
	}
	@GetMapping("/lcm")
	public String lcm(@RequestParam (name = "a") int a,@RequestParam (name = "b") int b) {
		return "LCM Of "+a +" & "+b +" is :"+(a<b?b:a);
	}
	
		
}
