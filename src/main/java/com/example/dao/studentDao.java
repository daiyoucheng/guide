package com.example.dao;


import com.example.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Mapper
public interface studentDao {
    List<UserBean> search(UserBean userBean);
}
