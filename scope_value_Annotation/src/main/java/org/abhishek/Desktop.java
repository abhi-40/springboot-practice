package org.abhishek;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("des")
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using desktop");

    }
}
