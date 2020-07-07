package com.sourcey.materiallogindemo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.ViewAction;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<SignupActivity> activityActivityTestRule =
            new ActivityTestRule<>(SignupActivity.class);

    @Test
    public void test_signup() {
        String name = "Gilbert";
        String address = "80 John Doe Street";
        String email = "Gilbert@ic.com";
        String phone = "7074356578";
        String password = "123456qwty";

        SignUpPage.enter_name_field(name);

        onView(Locators.signUp_address)
                .perform(scrollTo(), typeText(address));

        onView(withId(R.id.input_email))
                .perform(scrollTo(), typeText(email));

        onView(withId(R.id.input_mobile))
                .perform(scrollTo(), typeText(phone));

        onView(withId(R.id.input_password))
                .perform(scrollTo(), typeText(password));

        onView(withId(R.id.input_reEnterPassword))
                .perform(scrollTo(), typeText(password));

        onView(withId(R.id.input_name))
                .check(matches(withText(name)));

        onView(withId(R.id.input_address))
                .check(matches(withText(address)));

        onView(withId(R.id.input_email))
                .check(matches(withText(email)));

        onView(withId(R.id.input_mobile))
                .check(matches(withText(phone)));

        onView(withId(R.id.input_password))
                .check(matches(withText(password)));

        onView(withId(R.id.input_reEnterPassword))
                .check(matches(withText(password)));

        SignUpPage.clickSignUpButton();
    }
}