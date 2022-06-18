package com.newlecture.web.controller.admin.board;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

    @Autowired
    NoticeService service;

    @RequestMapping("list")
    public String list(Model model) {

        int page = 1;
        String field = "title";
        String query = "";

        List<NoticeView> list = service.getList(page, field, query);

        model.addAttribute("list", list);

        return "admin.board.notice.list";
    }

    @RequestMapping("detail")
    public String detail(Model model) {

        Notice notice = service.get(1);

        model.addAttribute("notice", notice);

        return "admin.board.notice.detail";
    }

    @RequestMapping("reg")
    public String reg() {

        return "admin.board.notice.reg";
    }


}
