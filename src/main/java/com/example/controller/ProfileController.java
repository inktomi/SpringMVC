package com.example.controller;

import com.example.model.ProfileCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: jitse
 * Date: 12/4/13
 * Time: 1:59 PM
 */
@Controller
@RequestMapping("/profile")
public class ProfileController extends BaseController{


    @Autowired
    TTController ttController;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView main () {
        ProfileCommand command = ttController.getProfile(myUserContext.getCurrentUser().getId());
        return new ModelAndView("profile", "command", command);
    }
}
