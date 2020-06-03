public class Winner {
    /*
    Determine the winner before players have pressed all buttons
    So there can't be draw. 
    */
    public static int checkWinnerBeforeFinish(int[][] arr) {
        // check row wise
        int count;
        for (int i = 0; i < 3; i++) {
            count = 0;
            int a = arr[i][0];
            if (a < 0)
                continue;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == a) {
                    count++;
                }
            }
            if (count == 3) {
                return a;
            }
        }
        // check column wise
        for (int i = 0; i < 3; i++) {
            count = 0;
            int a = arr[0][i];
            if (a < 0)
                continue;
            for (int j = 0; j < 3; j++) {
                if (arr[j][i] == a) {
                    count++;
                }
            }
            if (count == 3) {
                return a;
            }
        }
        // check main diagonal 
        int a = arr[0][0];
        if (a > 0) {
            count = 0;
            for (int i = 0; i < 3; i++) {
                if (arr[i][i] == a) {
                    count++;
                }
                if (count == 3) {
                    return arr[i][i];
                }
            }
        }
        // check other diagonal
        a = arr[0][2];
        if (a > 0) {
            count = 0;
            for (int i = 2; i >= 0; i--) {
                if (arr[2-i][i] == a) {
                    count++;
                }
                if (count == 3) {
                    return arr[2-i][i];
                }
            }
        }

        return -999; // no winner yet

    }
    // determine the winner after players have pressed all buttons
    // So there might be a game draw
    public static int checkWinner(int[][] arr) {
        // check row wise
        int count;
        for (int i = 0; i < 3; i++) {
            count = 0;
            int a = arr[i][0];
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == a) {
                    count++;
                }
            }
            if (count == 3) {
                return a;
            }
        }
        // check column wise
        for (int i = 0; i < 3; i++) {
            count = 0;
            int a = arr[0][i];
            for (int j = 0; j < 3; j++) {
                if (arr[j][i] == a) {
                    count++;
                }
            }
            if (count == 3) {
                return a;
            }
        }
        // check main diagonal wise
        int a = arr[0][0];
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i][i] == a) {
                count++;
            }
            if (count == 3) {
                return arr[i][i];
            }
        }
        // check other diagonal
        a = arr[0][2];
        count = 0;
        for (int i = 2; i >= 0; i--) {
            if (arr[2-i][i] == a) {
                count++;
            }
            if (count == 3) {
                return arr[2-i][i];
            }
        }
        return 0; // 0 means match draw
    }
}