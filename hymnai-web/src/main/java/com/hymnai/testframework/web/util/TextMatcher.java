package com.hymnai.testframework.web.util;

import lombok.Builder;

@Builder
public class TextMatcher {
    private String text;

    public boolean containsIgnoringCase(String expectedText) {
        return text.toLowerCase().contains(expectedText.toLowerCase());
    }
}
