package N_LeapYear;

class Main {
    public static void main(String[] args) {
        int year = 2020;
        int n = 5;
        int count = 0;
        while (count != n) {
            year = year + 1;
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                count++;
                System.out.println(year);
            }
        }
    }
}
