package com.example.springioc.ioc;

import org.springframework.stereotype.Component;

@Component
public class Chef {

    private IngridentsFactory ingridentsFactory;

    public Chef(IngridentsFactory ingridentsFactory){

        this.ingridentsFactory = ingridentsFactory;

    }

    public String cook(String menu){

        Ingridents ingridents = ingridentsFactory.get(menu);

        return ingridents.getMenu() + "-" + menu;

    }

}
