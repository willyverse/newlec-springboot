package com.newlecture.web.service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImp implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<NoticeView> getViewList() {
        return getViewList(1, "title", "", true);
    }

    @Override
    public List<NoticeView> getViewList(String field, String query) {
        return getViewList(1, field, query, true);
    }

    @Override
    public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {

        int size = 10;
        int offset = (page - 1) * size;
        size = offset + 10;

        List<NoticeView> list = noticeDao.getViewList(offset, size, field, query, pub);

        return list;
    }

    @Override
    public int getCount() {
        return noticeDao.getCount("title", "");
    }

    @Override
    public int getCount(String field, String query) {
        return noticeDao.getCount(field, query);
    }

    @Override
    public NoticeView getView(int id) {

        NoticeView noticeView = noticeDao.getView(id);

        return noticeView;
    }

    @Override
    public Notice getNext(int id) {
        return noticeDao.getNext(id);
    }

    @Override
    public Notice getPrev(int id) {
        return noticeDao.getPrev(id);
    }

    @Override
    public int updatePubAll(int[] pubIds, boolean pub) {
        return noticeDao.updatePubAll(pubIds, pub);
    }

    @Override
    public int deleteAll(int[] ids) {
        return noticeDao.deleteAll(ids);
    }

    @Override
    public int update(Notice notice) {
        return noticeDao.update(notice);
    }

    @Override
    public int delete(int id) {
        return noticeDao.delete(id);
    }

    @Override
    public int insert(Notice notice) {
        return noticeDao.insert(notice);
    }
}
