package com.hnjiandao.service;

import com.hnjiandao.domain.user.User;

public interface UserService {

	User selectByPrimaryKey(String userId);
}
