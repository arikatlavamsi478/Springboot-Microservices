package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;  
@RestController 
//@SecurityRequirement(name = "javainuseapi")
public class HelloWorldController   
{  
@RequestMapping("helloWorld/{id}")  
public String helloGet()   
{  
return "Hello javaTpoint";  
}  

@PostMapping("helloWorld/{id}")
@ResponseStatus(HttpStatus.OK)  
public String helloPost()   
{  
return "Hello javaTpointt";  
} 
@GetMapping("users/{id}")
@ResponseStatus(HttpStatus.OK)  
public String usersPut()   
{  
return "Hello javaTpointtt";  
} 
@PutMapping("users/{id}")
@ResponseStatus(HttpStatus.OK) 
public String usersApiPost()   
{  
return "Hello javaTpointttt";  
} 
@PostMapping("users/{id}")
@ResponseStatus(HttpStatus.OK) 
public String usersApiPut()   
{  
return "Hello javaTpointtttt";  
} 

}  