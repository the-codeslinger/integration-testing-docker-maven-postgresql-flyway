package com.thecodeslinger.dockerdbtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadphoneTestIT {

    @Test
    void uselessIntegrationTest() {
        final var headphone = new Headphone("Apple Earpods");
        assertEquals("Apple Earpods", headphone.getModel());
    }
}