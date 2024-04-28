package tech.toffu.business_web_app_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.toffu.business_web_app_project.DTO.UserResgistrationDTO;
import tech.toffu.business_web_app_project.services.UserService;

@Controller
@RequestMapping("/registration")
public class UserResgistrationController {
	private UserService userService;

	public UserResgistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserResgistrationDTO resgistrationDTO) {
		userService.save(resgistrationDTO);
		return "redirect:/registration?success";
	}
}
