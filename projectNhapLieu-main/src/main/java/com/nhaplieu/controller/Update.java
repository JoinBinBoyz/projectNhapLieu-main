// package com.nhaplieu.controller;

// import com.nhaplieu.domain.ThongTinMau;
// import com.nhaplieu.service.ThongTinMauService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

// @Controller
// public class Update {
//     @Autowired
//     ThongTinMauService nhaLieuDao;
    
//     @GetMapping("update")
//     public String nhaplieu(Model model) {
//         return "update";
//     }

//     @RequestMapping(value = "/update", method = RequestMethod.POST)
//     public String save(@ModelAttribute("update") ThongTinMau update) {
//        // Long id =update.getId_thong_tin_mau();
//        nhaLieuDao.deleteThongTinMauById(update.getId_thong_tin_mau());
//        //update.setId_thong_tin_mau(id);
//         nhaLieuDao.saveNhapLieu(update);
//         return "update";
//     }
// }
