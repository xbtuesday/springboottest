package com.lpan.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * conntect mysql by jdbctemplate
 * Created by Lpan on 2018/1/24.
 */
@RestController
@RequestMapping("/mysql")
public class Demo2Controller {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getuser")
    public List<Map<String,Object>> getDbType(){
        String sql = "SELECT  * FROM  lab_user";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String,Object> map:list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            if (null != entries){
                
            }
            for (Map.Entry<String,Object> entry:map.entrySet()) {
                String key = entry.getKey();
                 String value = entry.getValue().toString();
            }
        }
        return list;
    }
}
