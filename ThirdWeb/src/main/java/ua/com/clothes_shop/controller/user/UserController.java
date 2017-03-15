package ua.com.clothes_shop.controller.user;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.clothes_shop.entity.User;
import ua.com.clothes_shop.service.UserService;
import ua.com.clothes_shop.validator.UserValidator;

//@Controller
//@RequestMapping("/registration")
//@SessionAttributes("user")
public class UserController {
	
	
//	@Autowired
//	private UserService userService;
//	
//	@InitBinder("user")
//		protected void bind(WebDataBinder binder){
//			binder.setValidator(new UserValidator(userService));
//		}
//		
//		@PostMapping
//		public String save(@ModelAttribute("user") @Valid User user,  BindingResult br, SessionStatus status){
//			if(br.hasErrors()) return "redirect:/registration";
//			userService.save(user);
//			status.setComplete();
//			return "redirect:/registration";
//		}

}
