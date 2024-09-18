package _2024_08_30.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // Nad cem razmeshayem annotaciyu
@Retention(RetentionPolicy.RUNTIME) // do kakogo vremeni
public @interface Lifeforms {

}
