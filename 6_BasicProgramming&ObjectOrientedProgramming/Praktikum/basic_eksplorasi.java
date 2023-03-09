class Main {
    private static String encrypt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // melakukan pergeseran huruf sebanyak 10 urutan ke kanan pada susunan alfabet
                c = (char) (((c - 'A' + 10) % 26) + 'A');
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (((c - 'a' + 10) % 26) + 'a');
            }
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
