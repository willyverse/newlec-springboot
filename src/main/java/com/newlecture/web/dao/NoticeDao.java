package com.newlecture.web.dao;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoticeDao {

    List<NoticeView> getList(int offset, int size, String field, String title);

    NoticeView get(int id);

    int insert(Notice notice);
}
