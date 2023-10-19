public class Project {

        public static void main(String[] args) {
            int[] shuttleNumbers = new int[100];
            int count = 0;
            int number = 1;

            while (count < 100) {
                if (!containsUnluckyNumbers(number)) {
                    shuttleNumbers[count] = number;
                    count++;
                }
                number++;
            }

            for (int i = 0; i < shuttleNumbers.length; i++) {
                System.out.println("Марс-шатл №" + shuttleNumbers[i]);
            }
        }

        public static boolean containsUnluckyNumbers(int number) {
            while (number > 0) {
                int digit = number % 10;
                if (digit == 4 || digit == 9) {
                    return true;
                }
                number /= 10;
            }
            return false;
        }
    }
