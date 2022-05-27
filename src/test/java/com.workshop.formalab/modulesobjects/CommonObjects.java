package com.workshop.formalab.modulesobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public class CommonObjects extends PageObject {


    @FindBy(css = "body > app-root > app-signin > div > form > button")
    public static WebElement login_button;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/form/input")
    public static WebElement champ_username;


    public static Map<String, WebElement> objectsMapper() throws IllegalAccessException {
        Map<String, WebElement> COMMON_map = new HashMap<>();
        Field[] allFields = CommonObjects.class.getFields();
        for (Field field : allFields) {
            COMMON_map.put(field.getName(), (WebElement) field.get(field));
        }
        return COMMON_map;
    }
}
