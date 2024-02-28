package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping(value = "/evenorodd/{num}")
	public String evenOrOdd(@PathVariable(name = "num") int number) {
		return number % 2 == 0 ? number + " is Even" : number + " is Odd";
	}

	@GetMapping("/prime/{num}")
	public String prime(@PathVariable(name = "num") int number) {
		int fact = 0;
		if (number < 2) {
			return "Not a Prime Number";
		}
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				fact++;
			}
		}
		return fact == 0 ? number+" is a Prime Number" : number+" is a Not a Prime Number";
	}
	
	@PostMapping("/print")
	public String printDetails(@RequestBody User u){
		System.out.println("User id : "+u.getId());
		System.out.println("User Name : "+u.getName());
		System.out.println("User Phone : "+u.getPhone());
		System.out.println("User Email : "+u.getEmail());
		System.out.println("User Password : "+u.getPassword());
		
		return "Printed User Details in Console";
	}
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/armstrong/{num}")
//	public String armstrong(@PathVariable(name = "num") int number) {
//		int ex=count(number);
//		while (n!=0) {
//			sum=sum+power(n%10, ex);
//			n=n/10;
//			}
//		System.out.println(m==sum?"Arm":"Not ARM");
//		return null;	
//	}
//
//	private int count(int number) {
//		int c=0;
//		while(number!=0) {
//			int r=number%10;
//			c++;
//			number=number/10;
//		}
//		return 0;
//	}
	
}
