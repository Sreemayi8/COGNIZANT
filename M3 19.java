interface Playable {
    void play();
}

class Game implements Playable {
    public void play() {
        System.out.println("Playing the game!");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}