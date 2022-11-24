public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("gazelle", 5, "Serengeti", 80, "grass");
        Herbivores giraffe=new Herbivores("giraffe", 7, "", 60, "grass");
        Herbivores horse = new Herbivores("horse", 2, "", 60, "oats");
        gazelle.printAnimal();
        gazelle.toEat();
        gazelle.toSlip();
        gazelle.toMove();
        gazelle.toWalk();
        gazelle.toGraze();
        System.out.println();

        Predators hyena = new Predators("hyena", 4, "Serengeti", 65, "meat");
        Predators tiger = new Predators("tiger", 8, "", 70, "meat");
        Predators bear = new Predators("bear", 6, "taiga", 65, "всеяден");
        hyena.printAnimal();
        hyena.toEat();
        hyena.toSlip();
        hyena.toMove();
        hyena.toWalk();
        hyena.toHunt();
        System.out.println();

        Amphibians frog = new Amphibians("frog", 1, "swamp");
        Amphibians grassSnake = new Amphibians("Уж пресноводный", 1, "aquarium");
        frog.printAnimal();
        frog.toEat();
        frog.toSlip();
        frog.toMove();
        frog.toHunt();
        System.out.println();

        Flying seagull = new Flying("seagull", 1, "seashore", "fly");
        Flying albatross = new Flying("albatross", 2, "seashore", "fly");
        Flying falcon = new Flying("falcon", 3, "plain", "fly");
        seagull.printAnimal();
        seagull.toEat();
        seagull.toSlip();
        seagull.toMove();
        seagull.toHunt();
        seagull.toFly();
        System.out.println();

        NotFlying peacock = new NotFlying("peacock", 2, "zoo", "not fly");
        NotFlying penguin = new NotFlying("penguin", 1, "zoo", "not fly");
        NotFlying dodo = new NotFlying("dodo", 1, "zoo", "not fly");
        dodo.printAnimal();
        dodo.toEat();
        dodo.toSlip();
        dodo.toMove();
        dodo.toHunt();
        dodo.toWalk();
    }
}