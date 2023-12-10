package com.scmp.demojsonreader.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JsonSample {
    private A a;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class A {
        private String b;
        private String c;
        private D d;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class D {
        private List<E> e;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class E {
        private String value;
        private String onclick;
    }
}
