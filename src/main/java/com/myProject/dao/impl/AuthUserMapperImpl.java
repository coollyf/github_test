package com.myProject.dao.impl;

import com.myProject.dao.AuthUser;
import com.myProject.dao.AuthUserExample;
import com.myProject.dao.AuthUserMapper;
import com.myProject.controller.UserDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acer on 2018/4/2.
 */
@Service("AuthUserMapper")
public class AuthUserMapperImpl implements AuthUserMapper{
    @Autowired
    UserDao userDao;
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public int countByExample(AuthUserExample example){
        return userDao.countByExample(example);
    }

    public int deleteByExample(AuthUserExample example){
        return  userDao.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id){
        return userDao.deleteByPrimaryKey(id);
    }

    public int insert(AuthUser record){
        return userDao.insert(record);
    }

    public int insertSelective(AuthUser record){
        return userDao.insertSelective(record);
    }

    public List<AuthUser> selectByExample(AuthUserExample example){
       return userDao.selectByExample(example);
    }

    public AuthUser selectByPrimaryKey(Integer id){
       return userDao.selectByPrimaryKey(id);
    }

   public int updateByExampleSelective(@Param("record") AuthUser record, @Param("example") AuthUserExample example){
        return userDao.updateByExampleSelective(record,example);
   }

   public int updateByExample(@Param("record") AuthUser record, @Param("example") AuthUserExample example){
        return  userDao.updateByExample(record,example);
   }

    public int updateByPrimaryKeySelective(AuthUser record){
        return  userDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AuthUser record){
        return  userDao.updateByPrimaryKey(record);
    }
}
