package com.example.loginintercept.controller;

import com.example.loginintercept.config.ResultT;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author ch
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Created at 2020/8/6 4:52 下午
 */
@RestController
@RequestMapping("/gateway")
public class GatewayController {

  @RequestMapping(value = "/find",method = RequestMethod.POST)
  public ResultT find(){
    return ResultT.ok("find one success");
  }

}
