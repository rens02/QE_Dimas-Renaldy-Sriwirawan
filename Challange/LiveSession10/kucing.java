package hewanChallange;

public class kucing extends Hewani{
    @Override
    protected void attack(int s){
        this.attackPoin = s;
        System.out.println("hewanChallange.kucing adalah hewan yang baik ");
        System.out.println("Tapi jika menyerang dengan gigi nya damage nya adalah: "+attackPoin);

    }
    @Override
    protected void jalan(int k){
        this.kaki=k;
        System.out.println("Kucing dapat berlari dan berjalan menggunakan "+kaki+" kaki yang imut");
    }
    @Override
    protected void lawan(){
        System.out.println("Lawan Kucing adalah Anjing dan Tikus ");
    }
}
