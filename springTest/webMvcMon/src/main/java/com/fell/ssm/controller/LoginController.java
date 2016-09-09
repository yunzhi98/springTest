package com.fell.ssm.controller;


import com.fell.ssm.interceptor.MemberInterceptor;
import com.fell.ssm.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.URLDecoder;
/**
 * Created by wb-xuzhenbin on 2016/6/23.
 */
@Controller
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(String redirectURL, HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        //把拦截前路径存下来，以便登入成功可以直接请求到登录前的页面
        view.addObject("redirectURL", redirectURL);
        logger.info("日志打印");
        logger.debug("TEST");
        view.setViewName("/login");
        return view;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(String username, String password, String redirectURL,
                         HttpServletRequest request) {
        //模拟登陆成功 用户admin 密码admin的用户
        if (StringUtil.isNotBlank(username) && StringUtil.isNotBlank(password)
                && username.equals("crawler") && password.equals("crawler")) {
            //当登陆成功是，将用户信息存放到session中去
            HttpSession session = request.getSession();
            session.setAttribute(MemberInterceptor.SEESION_MEMBER, "crawler");
            if (StringUtil.isNotBlank(redirectURL)) {
                return "redirect:" + URLDecoder.decode(redirectURL);
            }
            return "redirect:/member/index.jsp";
        } else {
            if (StringUtil.isNotBlank(redirectURL)) {
                return "redirect:/login.jsp?" + URLDecoder.decode(redirectURL);
            }
            return "redirect:/login.jsp";
        }
    }
}