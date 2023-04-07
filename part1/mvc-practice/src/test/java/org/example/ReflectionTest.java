package org.example;

import org.example.annotation.Controller;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * @Controller 애노테이션이 설정돼 있는 모든 클래스를 찾아서 출력한다.
 */

public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @DisplayName("@Controller 애노테이션이 설정된 모든 클래스를 찾는다.")
    @Test
    void controllerScan() {
        Reflections reflections = new Reflections("org.example"); // org.example 하위 패키지에 있는 모든 클래스를 대상으로 조회

        // Controller 애노테이션을 가진 클래스 조회
        Set<Class<?>> beans = new HashSet<>();
        beans.addAll(reflections.getTypesAnnotatedWith(Controller.class));

        logger.debug("beans: [{}]", beans);
    }
}
