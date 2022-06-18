package com.newlecture.web.service;

import com.newlecture.web.entity.NoticeView;

import java.util.List;

public interface NoticeService {
    List<NoticeView> getList(int page, String field, String query);
    NoticeView get(int id);
}
