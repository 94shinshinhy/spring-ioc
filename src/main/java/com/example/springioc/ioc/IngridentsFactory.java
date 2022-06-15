package com.example.springioc.ioc;

import org.springframework.stereotype.Component;

@Component
public class IngridentsFactory {

    public Ingridents get(String menu){

        switch(menu){

            case "beef" :
                return new Beef(menu);
            case "pork" :
                return new Pork(menu);
            case "chicken" :
                return new Chicken(menu);
            default :
                return null;

        }

    }

}
