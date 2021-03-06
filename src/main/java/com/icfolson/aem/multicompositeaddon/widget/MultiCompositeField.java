package com.icfolson.aem.multicompositeaddon.widget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface MultiCompositeField {

    boolean matchBaseName() default false;

    @Deprecated
    String prefix() default "./";

    boolean allowReorder() default true;

    String baseName() default "item_";

    /**
     * Maximum number of items.  Defaults to 0 (unlimited).  Touch UI only.
     *
     * @return limit
     */
    int limit() default 0;
}