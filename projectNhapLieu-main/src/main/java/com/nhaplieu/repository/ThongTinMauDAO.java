package com.nhaplieu.repository;

import com.nhaplieu.domain.ThongTinMau;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThongTinMauDAO extends JpaRepository<ThongTinMau, Long> {

    Page<ThongTinMau> findByFlag(Pageable pageable, boolean flag);

}
