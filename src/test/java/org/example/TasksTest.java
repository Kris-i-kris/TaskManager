package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void containsQuerySimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("родителям");
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void containsQueryEpicTrue() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void containsQueryMeetingProjectTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

       // meeting.matches("приложение");
        boolean  expected = true;
        boolean actual = meeting.matches("Приложение");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void containsQueryMeetingTopicTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        // meeting.matches("приложение");
        boolean  expected = true;
        boolean actual = meeting.matches("приложения");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void containsQuerySimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("привет");
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void containsQueryEpicFalse() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("привет");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void containsQueryMeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        // meeting.matches("приложение");
        boolean expected = false;
        boolean actual = meeting.matches("привет");
        Assertions.assertEquals(expected, actual);
    }

}
