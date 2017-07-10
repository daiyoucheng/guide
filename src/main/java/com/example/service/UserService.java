package com.example.service;

import com.example.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/9.
 */
@Service
public interface UserService {
    List<UserBean> search(UserBean userBean);
}
