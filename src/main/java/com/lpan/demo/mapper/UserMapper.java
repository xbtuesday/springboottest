package com.lpan.demo.mapper;

import com.lpan.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Map;

/**
 * 用户操作接口
 * Created by Lpan on 2017/7/17.
 */
@Component
@Mapper
public interface UserMapper {

    //添加
    int insert(User user);
    //字段选择性的添加
    int insertSelective(Map<String, Object> paramMap);
    //根据主键删除
    int deleteByPrimaryKey(Integer id);
    //根据id查询
    User selectByPrimaryKey(Integer id);
    //根据主键字段选择性的更新
    int updateByPrimaryKeySelective(Map<String, Object> paramMap);
    //根据主键更新
    int updateByPrimaryKey(User record);
    //根据id 修改激活状态
    int updateStatus(String id);
    //分页查询
    List<User> selectAllByPage(Map<String, Object> paramMap);
    //分页查询条数
    int selectAllByPageCount(Map<String, Object> paramMap);
    //根据登录用户名和手机号查询用户
    List<User> selectUserByUserName(Map<String, Object> paramMap);
}
