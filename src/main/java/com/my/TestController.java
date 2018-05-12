package com.my;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Flash on 2018/5/12.
 */
@Controller
/**
 * test
 */
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}

