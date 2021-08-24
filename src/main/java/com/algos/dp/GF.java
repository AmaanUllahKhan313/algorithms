class GF{

    // Function
    static String Minimum_Window(char []s, char []t)
    {

        int m[] = new int[256];

        // Answer
        int ans = Integer.MAX_VALUE; // length of ans
        int start = 0; // starting index of ans
        int count = 0;
        // creating map
        for (int i = 0; i < t.length; i++) {
            if (m[t[i]] == 0)
                count++;
            m[t[i]]++;
        }

        // References of Window
        int i = 0;
        int j = 0;

        // Traversing the window
        while (j < s.length)
        {

            // Calculations
            m[s[j]]--;
            if (m[s[j]] == 0)
                count--;

            // Condition matching
            if (count == 0)
            {
                while (count == 0)
                {

                    // Soring ans
                    if (ans > j - i + 1)
                    {
                        ans = Math.min(ans, j - i + 1);
                        start = i;
                    }

                    // Sliding I
                    // Calculation for removing I
                    m[s[i]]++;
                    if (m[s[i]] > 0)
                        count++;

                    i++;
                }
            }
            j++;
        }

        if (ans != Integer.MAX_VALUE)
            return String.valueOf(s).substring(start, ans+start);
        else
            return "-1";
    }

    public static void main(String[] args)
    {
        String t = "ABC";
        String s = "FORAXKKFBCFORODEBANC";


        System.out.print("-->Smallest window that contain all character : ");
        System.out.print(Minimum_Window(s.toCharArray(), t.toCharArray()));

    }
}