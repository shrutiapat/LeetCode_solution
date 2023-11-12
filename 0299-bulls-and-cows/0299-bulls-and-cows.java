class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        int[] count1 = new int[10];
        int[] count2 = new int[10];

        for (int i = 0; i < secret.length(); ++i)
            if (secret.charAt(i) == guess.charAt(i))
                a++;
            else {
                count1[secret.charAt(i) - '0']++;
                count2[guess.charAt(i) - '0']++;
            }

        for (int i = 0; i < 10; ++i)
            b += Math.min(count1[i], count2[i]);

        return String.valueOf(a) + "A" + String.valueOf(b) + "B"; 
    }
}