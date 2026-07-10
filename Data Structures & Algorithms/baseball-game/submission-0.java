class Solution {
    public int calPoints(String[] operations) {

        int[] record = new int[operations.length];
        int i = 0;

        for (String op : operations) {

            if (op.equals("+")) {
                int last = record[i - 1];
                int secondLast = record[i - 2];
                record[i] = last + secondLast;
                i++;

            } else if (op.equals("D")) {
                record[i] = 2 * record[i - 1];
                i++;

            } else if (op.equals("C")) {
                i--;

            } else {
                record[i] = Integer.parseInt(op);
                i++;
            }
        }

        int totalSum = 0;

        for (int j = 0; j < i; j++) {
            totalSum += record[j];
        }

        return totalSum;
    }
}