package com.newlecture.web.dao;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDao {

    List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);
    int getCount(String field, String query);

    NoticeView getView(int id);
    Notice getNext(int id);
    Notice getPrev(int id);

    int updatePubAll(int[] ids, boolean pub);
    int deleteAll(int[] ids);
    int insert(Notice notice);
    int update(Notice notice);
    int delete(int id);

}
