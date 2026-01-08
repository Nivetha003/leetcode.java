class Solution {
    public int reverse(long x) {

        if (x >= -2147483648 && x <= 2147483647) {

            long numReverse = 0;
            long count = 0;
            long prod = 1;
            long num = Math.abs(x);

            while (num > 0) {
                long digit = num % 10;
                numReverse = (numReverse * 10) + digit;
                num = num / 10;
                ++count;
            }

            if (numReverse >= -2147483648 && numReverse <= 2147483647) {

                if (x < 0) {

                    for (int i = 1; i < count; i++) {
                        prod *= 10;
                    }

                    if (numReverse / prod == 0) {
                        return -(int)(numReverse % prod);
                    } else {
                        return -(int)(numReverse);
                    }

                } else {

                    for (int i = 1; i < count; i++) {
                        prod *= 10;
                    }

                    if (numReverse / prod == 0) {
                        return (int)(numReverse % prod);
                    } else {
                        return (int)numReverse;
                    }
                }

            }
            else {
                return 0;
            }

        } 
        else {
            return 0;
        }
    }
}