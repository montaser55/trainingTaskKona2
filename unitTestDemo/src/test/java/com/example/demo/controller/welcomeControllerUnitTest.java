package com.example.demo.controller;

import com.example.demo.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class welcomeControllerUnitTest {

    @Test
    void welcomeTest() {
        WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
        when(welcomeService.getWelcomeMessage("John")).thenReturn("Hello John");
        WelcomeController welcomeController= new WelcomeController(welcomeService);
        assertEquals("Hello John",welcomeController.welcome("John"));
    }
}