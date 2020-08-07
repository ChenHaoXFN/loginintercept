package com.example.loginintercept.controller;

import com.example.loginintercept.config.JwtUtils;
import com.example.loginintercept.config.ResultT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 *
 * @author ch
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Created at 2020/8/6 5:12 下午
 */
@RestController
public class LoginController {
  // 注入jwt工具类
  @Autowired
  private JwtUtils jwtUtils;
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResultT login(String name, String psw) {
    String userId = "123";
    String token = jwtUtils.generateToken(userId);
    return ResultT.ok().put("token", token);
  }
}
