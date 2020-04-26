package com.thecodeslinger.dockerdbtesting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class HeadphoneTestIT {
    @Autowired
    private HeadphoneEntityRepository headphoneEntityRepository;

    @Test
    void uselessIntegrationTest() {
        // Given
        final var earpods = new HeadphoneEntity();
        earpods.setModel("Apple Earpods");

        final var akg = new HeadphoneEntity();
        earpods.setModel("AKG K240 MKII");

        // When
        final var savedEarpods = headphoneEntityRepository.save(earpods);
        final var savedAkg = headphoneEntityRepository.save(akg);

        // Then
        assertTrue(0 < savedEarpods.getId());
        assertTrue(0 < savedAkg.getId());
    }
}