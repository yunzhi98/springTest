package com.fell.ssm.controller;

import com.fell.ssm.pojo.User;
import com.fell.ssm.service.UserService;
import com.fell.ssm.tool.StringManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wb-xuzhenbin on 2016/6/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;
    //private static Logger logger = LoggerFactory.getLogger(UserController.class);
    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        //logger.debug("TEST");
      //  logger.info("日志打印");
        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");
        return modelAndView;
    }
    @RequestMapping(value="/insert", method= RequestMethod.POST)
    public String insertUser(User user) throws Exception {
        String name = user.getName();
        String password = user.getPass_word();
        boolean type = false;
        String urlStr;
        int objId;
        if(StringManage.isNotNull(name)){
            User userObj = userService.findUserByName(name);
            //如果有对应的user 查询 返回id 对应的项目列表
            if(userObj != null){
                objId = userObj.getId();
                String objName = userObj.getName();
                String objPassWord = userObj.getPass_word();
                if(password.equals(objPassWord)){
                    type = true;
                }else {
                    type = false;
                }
            }else{
                //todo
                //如果没有user 新建个账户，返回对应id的列表
                objId = userService.insert(user);
                type = true;
            }
        }
        //跳转页面 带id过去
        if(type){
            urlStr = "redirect:/member/index.jsp";
        }else{
            //秘密错误页面
            urlStr = "redirect:/member/index.jsp";
        }
        return urlStr;
    }
}
