package com.rtmart.david.mybatisdemo.healthCheck;

import com.rtmart.david.mybatisdemo.mapper.CategoryMapper;
import com.rtmart.david.mybatisdemo.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hubao.yang
 * @date 2019/11/13 0013 上午 11:32
 */
@RequestMapping("/HealthCheck")
@Controller
public class HealthCheckController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "hello World";
    }

}
