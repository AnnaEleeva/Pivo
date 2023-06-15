package com.example.demo.controller;

import java.nio.charset.StandardCharsets;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(REST.APPLICATION_JSON_CHARSET_UTF_8)
@Consumes(REST.APPLICATION_JSON_CHARSET_UTF_8)
public interface REST {
    String APPLICATION_JSON_CHARSET_UTF_8 = "application/json;charset=UTF-8";

    MediaType APPLICATION_JSON = new MediaType("application", "json", StandardCharsets.UTF_8.name());
    MediaType TEXT_CSV = new MediaType("text", "csv", StandardCharsets.UTF_8.name());
    MediaType TEXT_TSV = new MediaType("text", "tab-separated-values", StandardCharsets.UTF_8.name());
    MediaType TEXT_XLS = new MediaType("text", "xls", StandardCharsets.UTF_8.name());
}

