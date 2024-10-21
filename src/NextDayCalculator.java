public class NextDayCalculator {
    public String getNextDayforMaxDay(int day, int month, int year) {
        String concat = "/";
        int daysInMonth;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        if (day == daysInMonth) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        } else {
            day++;
        }

        String result = day + concat + month + concat + year;
        return result;

    }


    public String getNextDay(int day, int month, int year) {
        String concat = "/";
        String result = (day+1) + concat + month + concat + year;
        return result;
    }


}