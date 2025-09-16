import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);  // parse the string into a LocalDate
        return d.getDayOfYear();              // get day of the year directly
    }
}
