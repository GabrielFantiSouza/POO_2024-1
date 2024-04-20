public class App {
    public static void main(String[] args) throws Exception {
        criaNaMain();
    }

    public static void criaNaMain(){
        Garagem g = new Garagem();
        Locomotiva l1 = new Locomotiva(1, null, 15,150);
        g.insereNaListaLocomotiva(l1);
        Locomotiva l2 = new Locomotiva(2, null, 13,130);
        g.insereNaListaLocomotiva(l2);
        Locomotiva l3 = new Locomotiva(3, null, 12,120);
        g.insereNaListaLocomotiva(l3);
        Locomotiva l4 = new Locomotiva(4, null, 10,100);
        g.insereNaListaLocomotiva(l4);
        Locomotiva l5 = new Locomotiva(5, null, 15,150);
        g.insereNaListaLocomotiva(l5);
        Locomotiva l6 = new Locomotiva(6, null, 17,170);
        g.insereNaListaLocomotiva(l6);
        Vagao v1 = new Vagao(1, null, 15);
        g.insereNaListaVagoes(v1);
        Vagao v2 = new Vagao(2, null, 15);
        g.insereNaListaVagoes(v2);
        Vagao v3 = new Vagao(3, null, 15);
        g.insereNaListaVagoes(v3);
        Vagao v4 = new Vagao(4, null, 15);
        g.insereNaListaVagoes(v4);
        Vagao v5 = new Vagao(5, null, 15);
        g.insereNaListaVagoes(v5);
        Vagao v6 = new Vagao(6, null, 15);
        g.insereNaListaVagoes(v6);
        //Menu.menu();
    }
}
