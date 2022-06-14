package com.newlecture.web.service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoticeServiceImp implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<Notice> getList() {

        List<Notice> list = noticeDao.getList();

        return list;
    }

    @Override
    public Notice get(int id) {

        Notice notice = noticeDao.get(id);

        return notice;
    }
}
