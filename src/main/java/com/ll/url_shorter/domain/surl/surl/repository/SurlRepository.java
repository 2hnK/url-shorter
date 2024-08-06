package com.ll.url_shorter.domain.surl.surl.repository;

import com.ll.url_shorter.domain.surl.surl.entity.Surl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurlRepository extends JpaRepository<Surl, Long> {

}