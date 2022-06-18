package com.newlecture.web.entity;

import lombok.Data;

import java.util.Date;

@Data
public class NoticeView extends Notice {
    private String memberName;

    public NoticeView() {}

    public NoticeView(
            int id,
            String title,
            String content,
            Date regDate,
            int hit,
            boolean pub,
            String memberId,
            String memberName) {
        super(id, title, content, regDate, hit, pub, memberId);
        this.memberName = memberName;
    }
}
