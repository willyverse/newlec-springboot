package com.newlecture.web.dao;

import com.newlecture.web.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoticeDao {

    @Select("select * from notice")
    List<Notice> getList();

    @Select("select * from notice where id = ${id}")
    Notice get(int id);
}
