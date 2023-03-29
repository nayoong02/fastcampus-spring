package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // operand1=11
    @Test
    void createTest() throws Exception {
        QueryStrings queryStrings = new QueryStrings("operand1=11&operator=*&operand2=55");
        assertThat(queryStrings).isNotNull();
    }
}
