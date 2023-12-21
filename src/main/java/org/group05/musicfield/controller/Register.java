package org.group05.musicfield.controller;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Register {
    @GetMapping("/register")
    public int register() {
        return 0;
    }
}
