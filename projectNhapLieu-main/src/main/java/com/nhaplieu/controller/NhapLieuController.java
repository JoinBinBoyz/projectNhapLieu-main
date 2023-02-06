package com.nhaplieu.controller;

import java.util.List;

import com.nhaplieu.domain.ThongTinMau;
import com.nhaplieu.service.ThongTinMauService;
import com.nhaplieu.utils.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NhapLieuController {

    @Autowired
    ThongTinMauService nhaLieuDao;

    @Autowired
    SessionService sessionService;

    @GetMapping("nhaplieu")
    public String nhaplieu(Model model) {
        if (sessionService.get("user") == null) {
            return "redirect:login";
        }
        model.addAttribute("message", sessionService.get("user"));
        return "nhaplieu";
    }

    @GetMapping("list/{pageNo}")
    public String index(@PathVariable(value = "pageNo") int pageNo, Model model) {

        if (sessionService.get("user") == null) {
            return "redirect:login";
        }

        Page<ThongTinMau> page;
        List<ThongTinMau> listThongTinMau;
        int pageSize = 5;

        if (pageNo <= 0) {
            page = nhaLieuDao.findPaginated(1, pageSize);
            listThongTinMau = page.getContent();
        } else {
            page = nhaLieuDao.findPaginated(pageNo, pageSize);
            listThongTinMau = page.getContent();
        }
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("list", listThongTinMau);

        return "listnhaplieu";
    }

    @RequestMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Long id) {
        ThongTinMau item = nhaLieuDao.findById(id).get();
        model.addAttribute("item", item);
        return "update";
    }

    @PostMapping("nhaplieu")
    public String save(@ModelAttribute("nhaplieu") ThongTinMau nhaplieu) {
        long generatedLong;
        if (sessionService.get("user") == null) {
            return "redirect:login";
        }
            long leftLimit = 1L;
            long rightLimit = 10000L;
            generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
            nhaplieu.setId_thong_tin_mau(generatedLong);
            nhaplieu.setUsername("long");
            nhaLieuDao.saveNhapLieu(nhaplieu);
        String url = "redirect:/edit/" + String.valueOf(generatedLong);
        return url;
    }

    @PostMapping("/edit/{id}")
    public String updateThongTin(@ModelAttribute("nhaplieu") ThongTinMau nhaplieu ,@PathVariable("id") Long id) {
        if (sessionService.get("user") == null) {
            return "redirect:login";
        }

        nhaplieu.setId_thong_tin_mau(id);
        nhaplieu.setUsername("long");
        nhaLieuDao.saveNhapLieu(nhaplieu);
        String url = "redirect:/list/1";
        return url;
    }
    @GetMapping("/{id}")
    public String deleteThongTin(@ModelAttribute("nhaplieu") ThongTinMau nhaplieu ,@PathVariable("id") Long id) {
        if (sessionService.get("user") == null) {
            return "redirect:login";
        }
        nhaLieuDao.deleteThongTinMauById(id);
        return "redirect:list/1";
    }
}
