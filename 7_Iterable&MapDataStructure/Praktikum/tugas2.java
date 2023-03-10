import java.util.*;

public class tugas2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kumpulan angka: ");
        String input = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        List<Character> unique = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                unique.add(c);
            }
        }

        System.out.println("Angka yang hanya muncul sekali pada input: " + unique);
    }
}
