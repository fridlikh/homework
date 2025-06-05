package ru.stepup.HW.cases;

public class WeekDay {
    public static String day(int x){
        String dayName = "это не день недели";
        switch (x) {
            case 1: dayName= "понедельник"; break;
            case 2: dayName= "вторник"; break;
            case 3: dayName= "среда"; break;
            case 4: dayName= "четверг"; break;
            case 5: dayName= "пятница"; break;
            case 6: dayName= "суббота"; break;
            case 7: dayName= "воскресенье"; break;
        }
        return dayName;
    };
}
