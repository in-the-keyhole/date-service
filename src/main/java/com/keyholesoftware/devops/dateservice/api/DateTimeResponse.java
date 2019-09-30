package com.keyholesoftware.devops.dateservice.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeResponse {

    public DateTimeResponse(LocalDateTime datetime, FormatStyle formatStyle) {
        this.datetime = datetime.format(DateTimeFormatter.ofLocalizedDateTime(formatStyle));
    }

    private String datetime;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}