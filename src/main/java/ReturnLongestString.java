public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of a String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr) {
        // Check if the array is empty, if so, return null or handle as needed
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Assume the first string is the longest
        String longestStr = arr[0];

        // Iterate through the rest of the array and find the longest string
        for (String str : arr) {
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }

        // Return the longest string
        return longestStr;
    }
}
