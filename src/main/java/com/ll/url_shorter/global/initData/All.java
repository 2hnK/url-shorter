package com.ll.url_shorter.global.initData;

import com.ll.url_shorter.domain.member.member.entity.Member;
import com.ll.url_shorter.domain.member.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class All {
    @Lazy
    @Autowired
    private All self;
    private final MemberService memberService;

    @Bean
    @Order(3)
    public ApplicationRunner initAll() {
        return args -> {
            self.work1();
        };
    }

    @Transactional
    public void work1() {
        if (memberService.count() > 0) return;

        Member memberSystem = memberService.join("system", "1234", "시스템").getData();
        Member memberAdmin = memberService.join("admin", "1234", "관리자").getData();

        Member memberUser1 = memberService.join("user1", "1234", "사용자 1").getData();
        Member memberUser2 = memberService.join("user2", "1234", "사용자 2").getData();

    }

}
