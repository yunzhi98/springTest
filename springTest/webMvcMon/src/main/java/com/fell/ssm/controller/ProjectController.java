package com.fell.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wb-xuzhenbin on 2016/8/25.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {
    @RequestMapping(value="/getProjectJS", method= RequestMethod.GET)
    public String insertUser(int userId) throws Exception {
        return "";
    }
}
