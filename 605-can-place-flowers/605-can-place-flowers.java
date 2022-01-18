class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countZero = 0;

		if (flowerbed[0] == 0)
			countZero++;

		for (int i = 0; i < flowerbed.length; i++) {

			if (flowerbed[i] == 1) {
				countZero--;
				n = n - (countZero / 2);
				countZero = 0;
			} else {
				countZero++;
			}
		}

		n = n - (countZero / 2);

		return n <= 0;
    }
}