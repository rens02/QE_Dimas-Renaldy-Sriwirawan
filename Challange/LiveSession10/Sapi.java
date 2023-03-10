package hewanChallange;

public class Sapi extends Hewani{
    @Override
    protected void attack(int s){
        System.out.println("hewanChallange.Sapi adalah hewan baik, tidak menyerang");
        this.attackPoin = s;
        System.out.println("Tapi jika menyerang dmg nya adalah: "+attackPoin);
    }
    @Override
    protected void jalan(int k){
        this.kaki =k;
        System.out.println("hewanChallange.Sapi berjalan menggunakan "+kaki+" kaki yang imut");
    }
    @Override
    protected void lawan(){
        System.out.println("Lawan sapi adalah penyakit yang menular hewan pada umumnya");
    }
}
