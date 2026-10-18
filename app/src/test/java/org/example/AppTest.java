package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    private final AppInfo info = new AppInfo();

    @Test
    void applicationNameShouldBeCorrect() {
        assertEquals("Student Management System",
                info.getApplicationName());
    }

    @Test
    void technologyShouldBeCorrect() {
        assertEquals("Java 21", info.getTechnology());
    }

    @Test
    void buildToolShouldBeCorrect() {
        assertEquals("Gradle", info.getBuildTool());
    }

    @Test
    void applicationStatusShouldBeCorrect() {
        assertEquals("Running Successfully",
                info.getStatus());
    }
}