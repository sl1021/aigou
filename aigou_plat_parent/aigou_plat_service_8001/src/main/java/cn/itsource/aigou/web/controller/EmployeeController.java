package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;

import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
public class EmployeeController {

    //@RequestBody 接受前台传过来的数据
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {
        if ("ls".equals(employee.getUsername()) && "123456".equals(employee.getPassword())) {
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        } else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
    //@RequestBody 接受前台传过来的数据
    @RequestMapping(value = "/lget", method = RequestMethod.GET)
    public AjaxResult login1() {
       return AjaxResult.me();
    }

}
