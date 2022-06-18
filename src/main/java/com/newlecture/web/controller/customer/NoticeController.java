package com.newlecture.web.controller.customer;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @RequestMapping("list")
    public String list(Model model) {

        int page = 1;
        String field = "title";
        String query = "";

        List<NoticeView> list = service.getList(page, field, query);

        model.addAttribute("list", list);

        return "customer.notice.list";
    }

    @RequestMapping("detail")
    public String detail() {

        return "customer.notice.detail";
    }
}
