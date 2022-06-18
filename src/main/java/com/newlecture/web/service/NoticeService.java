package com.newlecture.web.service;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

import java.util.List;

public interface NoticeService {

    // - 페이지를 요청할 때
    List<NoticeView> getViewList();

    // - 검색을 요청할 때;
    List<NoticeView> getViewList(String field, String query);

    // - 페이지를 요청할 때
    List<NoticeView> getViewList(int page, String field, String query, boolean pub);
    int getCount();
    int getCount(String field, String query);

    // - 자세한 페이지를 요청할 때
    NoticeView getView(int id);
    Notice getNext(int id);
    Notice getPrev(int id);

    // - 일괄 공개를 요청할 때
    int updatePubAll(int[] ids, boolean pub);

    // - 일괄 삭제를 요청할 때
    int deleteAll(int[] ids);

    // - 수정 페이지를 요청할 때
    int update(Notice notice);
    int delete(int id);
    int insert(Notice notice);

}
