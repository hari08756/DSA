class Solution {
    private final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String[] scales = {"", "Thousand", "Million", "Billion"};
        int scaleIndex = 0;
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int chunk = num % 1000;
            num /= 1000;
            if (chunk != 0) {
                String chunkStr = convertLessThanOneThousand(chunk);
                if (scaleIndex > 0) {
                    chunkStr += " " + scales[scaleIndex];
                }
                if (result.length() > 0) {
                    result.insert(0, " ");
                }
                result.insert(0, chunkStr);
            }
            scaleIndex++;
        }
        return result.toString();
    }

    private String convertLessThanOneThousand(int num) {
        StringBuilder sb = new StringBuilder();
        int hundreds = num / 100;
        if (hundreds > 0) {
            sb.append(units[hundreds]).append(" Hundred");
            num %= 100;
            if (num > 0) {
                sb.append(" ");
            }
        }
        if (num < 20) {
            sb.append(units[num]);
        } else {
            int tensDigit = num / 10;
            int unitsDigit = num % 10;
            sb.append(tens[tensDigit]);
            if (unitsDigit > 0) {
                sb.append(" ").append(units[unitsDigit]);
            }
        }
        return sb.toString();
    }
}