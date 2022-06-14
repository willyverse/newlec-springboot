package com.newlecture.web.service;

import com.newlecture.web.entity.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getList();
    Notice get(int id);
}
