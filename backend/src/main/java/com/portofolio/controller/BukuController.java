package com.portofolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BukuController {
    
    @RequestMapping("/buku")
        public String buku() {
            return "Halaman Buku";
        }
}
