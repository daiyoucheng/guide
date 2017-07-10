package com.example.service.impl;

import com.example.bean.UserBean;
import com.example.dao.studentDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    studentDao studentDao;

    @Override
    public List<UserBean> search(UserBean userBean) {
        List list = studentDao.search(userBean);
        return list;
    }
}
