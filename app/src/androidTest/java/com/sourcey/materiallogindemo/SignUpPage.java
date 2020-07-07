package com.sourcey.materiallogindemo;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class SignUpPage {

    public static void clickSignUpButton() {
        onView(withId(R.id.btn_signup))
                .perform(scrollTo(), click());
    }

    public static void enter_name_field(String name) {
        onView(withId(R.id.input_name))
                .perform(scrollTo(), typeText(name));
    }
}
