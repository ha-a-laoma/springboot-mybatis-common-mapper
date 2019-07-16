package com.ham.dao;

import com.ham.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuMapper {
    List<Menu> findAll();
    int saveMenu(Menu menu);
    int deleteById(Integer id);
    int updateByMenu(Menu menu);
    Menu findMenuById(Integer id);
}
