package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.entities.PersistentLogins;
import web.entities.Users;
import web.service.PersistentLoginsService;
import web.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private PersistentLoginsService persistentLoginsService;

	@RequestMapping(value = "view/{username}", method = RequestMethod.GET)
	public String productList(@PathVariable("username") String username, ModelMap modelMap) {
		modelMap.put("usersss", userService.getByUserName(username));
		return "pages/hello";
	}

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(ModelMap modelMap) {
		modelMap.put("userss", userService.findAll());
		return "user/index";
	}

	@RequestMapping(value = "viewPersistenLogins", method = RequestMethod.GET)
	public String viewPersistenLogins(ModelMap modelMap) {
		modelMap.put("persistentLoginss", persistentLoginsService.findAll());
		return "persistentLogins/index";
	}

	@RequestMapping(value = "viewPersistenLogins/edit/{token}", method = RequestMethod.GET)
	public String edit(@PathVariable("token") String token, ModelMap modelMap) {
		modelMap.put("persistentLogins", persistentLoginsService.getByToken(token));
		return "persistentLogins/edit";
	}

	@RequestMapping(value = "viewPersistenLogins/edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute("persistentLogins") PersistentLogins persistentLogins) {
		persistentLoginsService.update(persistentLogins);
		return "redirect:../user.html";
	}

	@RequestMapping(value = "edit/{username}", method = RequestMethod.GET)
	public String edituser(@PathVariable("username") String username, ModelMap modelMap) {
		modelMap.put("users", userService.getByUserName(username));
		return "user/edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edituser(@ModelAttribute("users") Users users) {
		userService.update(users);
		return "user/infouser";
	}
}
