package com.newlecture.web.service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.NoticeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImp implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<NoticeView> getList(int page, String field, String query) {

        int size = 10;
        int offset = 0 + (page - 1) * size;
        size = offset + 10;

        List<NoticeView> list = noticeDao.getList(offset, size, field, query);

        return list;
    }

    @Override
    public NoticeView get(int id) {

        NoticeView noticeView = noticeDao.get(id);

        return noticeView;
    }
}
