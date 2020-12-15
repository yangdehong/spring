package com.ydh.redsheep.importbean;

import org.springframework.context.annotation.Import;

@Import({String.class, MyClass.class, MyClass2.class})
public class ImportDemo {
}
