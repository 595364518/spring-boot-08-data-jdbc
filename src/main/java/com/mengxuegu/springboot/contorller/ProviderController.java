package com.mengxuegu.springboot.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:18 2019/11/4
 */
//@Controller
//@ResponseBody
@RestController//直接返回一个json对象，不返回一个页面
public class ProviderController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/providers")
    public Map list(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from provider where pid=1");
        Map<String, Object> map = maps.get(0);
        return map;
    }
}
