package hewanChallange;

public class anjing extends Hewani{
    @Override
    protected void attack(int s){
        this.attackPoin = s;
        System.out.println("Anjing dapat menyerang dengan gigi nya dmg nya adalah: "+attackPoin);
    }
    @Override
    protected void jalan(int k){
        this.kaki=k;
        System.out.println("Anjing dapat berlari dan berjalan menggunakan "+kaki+" kaki");
    }
    @Override
    protected void lawan(){
        System.out.println("Lawan Anjing adalah hewanChallange.kucing ");
    }
}
