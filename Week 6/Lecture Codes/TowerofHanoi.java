public class TowerofHanoi {
    public static String hanoi(int N, boolean left) {
        if (N == 0) return " ";
        String move;
        if (left) move = N + "Left";
        else move = N + "Right";
        return hanoi(N - 1, !left) + move + hanoi(N - 1, !left);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(hanoi(N, true));
    }
}
