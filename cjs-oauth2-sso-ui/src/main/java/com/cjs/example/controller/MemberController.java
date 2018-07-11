package com.cjs.example.controller;

import com.cjs.example.domain.Member;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    /**
     * 会员列表页面
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("member/list");
        return modelAndView;
    }

    /**
     * 导出
     */
    @PreAuthorize("hasAuthority('memberExport')")
    @ResponseBody
    @RequestMapping("/export")
    public List<Member> export() {
        Member member = new Member();
        member.setName("苏九儿");
        member.setCode("1000");
        member.setMobile("13112345678");
        member.setGender(1);
        Member member1 = new Member();
        member1.setName("郭双");
        member1.setCode("1001");
        member1.setMobile("15812346723");
        member1.setGender(1);
        List<Member> list = new ArrayList<>();
        list.add(member);
        list.add(member1);
        return list;
    }

    /**
     * 详情
     */
    @PreAuthorize("hasAuthority('memberDetail')")
    @RequestMapping("/detail")
    public ModelAndView detail() {
        return new ModelAndView(" member/detail");
    }
}
