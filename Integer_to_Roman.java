public class Integer_to_Roman {
    public int romanToInt(String s) {
        int ans = 0;
        
        int[] roman = new int[128];  

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

       
        for (int i = 0; i < s.length() - 1; ++i) {
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
                ans -= roman[s.charAt(i)]; 
            } else {
                ans += roman[s.charAt(i)]; 
            }
        }

        ans += roman[s.charAt(s.length() - 1)];

        return ans;
    }

    public static void main(String[] args) {
        Integer_to_Roman solution = new Integer_to_Roman();
        String roman = "MCMXCIV";  // Example input
        System.out.println("Integer value of Roman numeral " + roman + " is: " + solution.romanToInt(roman));
    }
}
