package com.sourcey.materiallogindemo;

import android.view.View;

import org.hamcrest.Matcher;

import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class Locators {

    public static final Matcher<View> signUp_address = withId(R.id.input_address);
}
