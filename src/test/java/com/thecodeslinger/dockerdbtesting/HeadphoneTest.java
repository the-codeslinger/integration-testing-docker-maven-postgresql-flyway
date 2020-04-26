package com.thecodeslinger.dockerdbtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadphoneTest {

    @Test
    void uselessTest() {
        final var headphone = new Headphone("AKG K240 MKII");
        assertEquals("AKG K240 MKII", headphone.getModel());
    }
}