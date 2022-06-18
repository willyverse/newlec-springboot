package com.newlecture.web.dao;

import com.newlecture.web.entity.NoticeView;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
class NoticeDaoTest {

    @Autowired
    private NoticeDao noticeDao;

    @Test
    void test() {
        List<NoticeView> list = noticeDao.getViewList(0, 1, "title", "", true);

        System.out.println(list.get(0));
    }
}