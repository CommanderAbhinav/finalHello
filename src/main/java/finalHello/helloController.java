package finalHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/")
public class helloController {
	
	@GetMapping("/hello")
	public String showHello() {
		System.out.println("ABC");
		return "helloWorld";
	}
      
}
