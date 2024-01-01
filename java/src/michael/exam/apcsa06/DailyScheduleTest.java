package michael.exam.apcsa06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DailyScheduleTest {
    @Test
    void testClearConflicts() {
        DailySchedule ds = new DailySchedule();
        ArrayList<Appointment> schedule = new ArrayList<Appointment> ();
        schedule.add(new Appointment(30, 90));
        schedule.add(new Appointment(100, 180));
        schedule.add(new Appointment(200, 210));
        schedule.add(new Appointment(240, 280));
        schedule.add(new Appointment(300, 390));
        ds.setAppList(schedule);
        ds.clearConflicts(new Appointment(30, 180));
        assertEquals(3, ds.getAppList().size());
    }

    @Test
    void testAddAppt() {
        DailySchedule ds = new DailySchedule();
        ArrayList<Appointment> schedule = new ArrayList<Appointment> ();
        schedule.add(new Appointment(30, 90));
        schedule.add(new Appointment(100, 180));
        schedule.add(new Appointment(200, 210));
        schedule.add(new Appointment(240, 280));
        schedule.add(new Appointment(300, 390));
        ds.setAppList(schedule);
        assertTrue(ds.addAppt(new Appointment(400, 440), false));
        assertTrue(ds.addAppt(new Appointment(400, 440), true));
        assertTrue(ds.addAppt(new Appointment(10, 200), true));
        assertFalse(ds.addAppt(new Appointment(10, 200), false));
    }

}
