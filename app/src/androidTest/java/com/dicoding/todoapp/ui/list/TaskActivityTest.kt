package com.dicoding.todoapp.ui.list

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import com.dicoding.todoapp.R
import com.dicoding.todoapp.ui.add.AddTaskActivity

//TODO 16 : Write UI test to validate when user tap Add Task (+), the AddTaskActivity displayed
class TaskActivityTest {
    @get:Rule
    val activity = ActivityScenarioRule(TaskActivity::class.java)

    @Test
    fun loadAddTaskActivity_Success() {
        Intents.init()
        onView(withId(R.id.fab)).perform(click())
        intended(hasComponent(AddTaskActivity::class.java.name))
        onView(withId(R.id.add_ed_title)).check(matches(isDisplayed()))
        onView(withId(R.id.add_ed_description)).check(matches(isDisplayed()))
        onView(withId(R.id.add_tv_due_date)).check(matches(isDisplayed()))
    }
}