public class App {

    static Menu menu = new Menu();
    static Garagem g = new Garagem();

    public static void main(String[] args) throws Exception {
        setup(); 
        Menu.menu(g);
    }

    public static void setup(){
        g.insereNaListaLocomotiva(new Locomotiva(1, null, 15,150));
        g.insereNaListaLocomotiva(new Locomotiva(2, null, 13,130));
        g.insereNaListaLocomotiva(new Locomotiva(3, null, 12,120));
        g.insereNaListaLocomotiva(new Locomotiva(4, null, 10,100));
        g.insereNaListaLocomotiva(new Locomotiva(5, null, 15,150));
        g.insereNaListaLocomotiva(new Locomotiva(6, null, 17,170));
        g.insereNaListaVagoes(new Vagao(1, null, 15));
        g.insereNaListaVagoes(new Vagao(2, null, 15));
        g.insereNaListaVagoes(new Vagao(3, null, 15));
        g.insereNaListaVagoes(new Vagao(4, null, 15));
        g.insereNaListaVagoes(new Vagao(5, null, 15));
        g.insereNaListaVagoes(new Vagao(6, null, 15));
    }
}
