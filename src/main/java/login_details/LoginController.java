package login_details;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class LoginController {
	
	@RequestMapping("/home")
	String welcome()
	{
		return "Welcome to Homepage";
	}
	
	
	@Autowired
	LoginRepository lr;
	
	@GetMapping("/all")
	public List <Login> getall()
	{
		return (List<Login>) lr.findAll();
		
	}
	
	@PostMapping("/signup")
	public Login signup(@Valid @RequestBody Login l)
	{
		return lr.save(l);
		
	}
	
	

}
