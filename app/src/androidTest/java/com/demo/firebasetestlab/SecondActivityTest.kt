package com.demo.firebasetestlab

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @Test
    fun testActivity_inView() {

        val activity_scenario = ActivityScenario.launch(SecondActivity::class.java)

        onView(withId(R.id.secondary)).check(matches(isDisplayed()))

    }

    // Check the visibility
    @Test
    fun testVisibility_title_nextButton() {
        val activity_scenario = ActivityScenario.launch(SecondActivity::class.java)

        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))

        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
    }

    // Check the text
    @Test
    fun testTitleTextDisplayed() {
        val activity_scenario = ActivityScenario.launch(SecondActivity::class.java)

        onView(withId(R.id.activity_secondary_title)).check(matches(withText(R.string.text_second_activity)))
    }
}