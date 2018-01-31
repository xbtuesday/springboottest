package com.lpan.demo.service;/**
 * Created by Administrator on 2018/1/24.
 */

import com.lpan.demo.domain.User;
import com.lpan.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * user
 * Created by Lpan on 2018/1/24.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<User> getuserlist(){
        Map<String,Object> map = new HashMap<String,Object>();
        int count = userMapper.selectAllByPageCount(map);
        logger.info(String.valueOf(count));
        List<User> userList = userMapper.selectAllByPage(map);
        return userList;
    }


}
