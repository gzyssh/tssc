package com.yz.tssc.controller;


import com.yz.tssc.commons.result.JsonResult;
import com.yz.tssc.commons.result.JsonResultUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 登录 控制器
 * </p>
 *
 * @author guozy
 * @create 2019/06/24
 */
@RestController("/admin")
public class LoginController {

    @RequestMapping("logout")
    public JsonResult logout(@ModelAttribute("userId") Long userId) {
        if(userId == null){
            return JsonResultUtils.getErrorJson("退出失败");
        }
        return JsonResultUtils.getSuccessJson("退出成功");
    }

}
