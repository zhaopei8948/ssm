package com.hnjiandao.service;

import com.hnjiandao.domain.User;

public interface UserService {

	User selectByPrimaryKey(String userId);
}
