package com.newlecture.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Notice {
    private int id;
    private String title;
    private String content;
    private Date regDate;
    private int hit;
    private boolean pub;
    private String memberId;

}
