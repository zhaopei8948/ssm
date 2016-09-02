package com.hnjiandao.service;

import java.util.List;

import com.hnjiandao.domain.User;

public interface UserService {
   int insertByService(User user);
   List<User> selectAll();
   User selectByPrimaryKey(String id);
   User selectByName(String username);
   User selectByLogin(String username,String password)throws Exception ;
}
