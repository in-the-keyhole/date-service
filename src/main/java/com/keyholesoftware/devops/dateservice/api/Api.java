package com.keyholesoftware.devops.dateservice.api;

import java.time.LocalDateTime;
import java.time.format.FormatStyle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class Api {

    @GetMapping(value="/currentDateTime", produces="application/json")
    public DateTimeResponse currentDateTime() {
        return new DateTimeResponse(LocalDateTime.now(), FormatStyle.MEDIUM);
    }
}