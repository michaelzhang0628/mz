package michael.exam.apcsa06;

import java.util.ArrayList;
import java.util.Iterator;

public class DailySchedule {
    private ArrayList<Appointment> appList;

    public DailySchedule() {
        appList = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppList() {
        return appList;
    }

    public void setAppList(ArrayList<Appointment> appList) {
        this.appList = appList;
    }

    public void clearConflicts(Appointment appt) {
        Iterator<Appointment> it = appList.iterator();
        while(it.hasNext()) {
            Appointment existing = it.next();
            if (appt.conflictWith(existing)) {
                it.remove();
            }
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency) {
        if (emergency) {
            clearConflicts(appt);
        } else {
            for (Appointment existing : appList) {
                if (appt.conflictWith(existing)) {
                    return false;
                }
            }
        }
        appList.add(appt);
        return true;
    }
}
