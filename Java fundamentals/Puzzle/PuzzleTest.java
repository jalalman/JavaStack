public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava pz=new PuzzleJava();
        pz.getTenRolls();
        System.out.println("------------------------");
        System.out.println(pz.getRandomLetter());
        System.out.println(pz.generatePassword());
        pz.getNewPasswordSet(10);
        for (int i=0 ; i<pz.getNewPasswordSet(10).length;i++){
            System.out.println(pz.getNewPasswordSet(10)[i]);
        }
        System.out.println("------------------------");
        String[] name={"ahmad","jalal","sami","hello"};
        pz.shuffleArray(name);
    }
}
