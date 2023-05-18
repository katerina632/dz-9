public class Main {
    public static void main(String[] args) {

        Person man = new Man("Bob","Drew",65, null);
        Person woman = new Woman("Nancy","Black",45, (Man)man);

        System.out.print(man);
        System.out.print(woman);

        woman.registerPartnership(man);
        System.out.print(man);
        System.out.print(woman);

        man.deregisterPartnership(true);
        System.out.print(man);
        System.out.print(woman);
        woman.deregisterPartnership(false);

        System.out.println(man.isRetired());
        System.out.println(woman.isRetired());

    }
}
