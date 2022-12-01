package it.antonio.eserciziomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
	public class GreetingController {

		@GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "greeting";
		}
			
			@GetMapping("/chisono")
			public String chisono() {
			return "chisono";
		}

			@GetMapping("/contatti")
			public String contatti() {
			return "contatti";
		}
			
			@GetMapping("/servizi")
			public String servizi() {
			return "servizi";
		}
			@GetMapping("/index")
			public String index() {
			return "index";
		}
			@GetMapping(path = "/signup")
			public String getSignUpForm(@ModelAttribute SignUpForm signUpForm) {
				return "contatti";
			}

			@PostMapping(path = "/signup-submit")
			public String submitSignUp(@ModelAttribute SignUpForm signUpForm,Model model ) 
			{
				model.addAttribute("signUpForm",signUpForm);
				return "signup-success";
			}
	}

