package com.example.demo.controller;

import com.example.demo.service.PivoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class PivoControllerImpl implements PivoController {
    private final PivoService pivoService;

    public PivoControllerImpl(PivoService pivoService) {
        this.pivoService = pivoService;
    }

    @Override
    public String getRandomName() {
        return pivoService.getRandomName();
    }

    @Override
    public UserView getUser(String userId) {
       return pivoService.getUser(userId);
    }
}
