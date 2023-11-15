package subtipagem;

public class Aplica_Subtipagem {
    public static void main(String args[]){
        Define_Mamifero df = new Define_Mamifero();
        Mamifero f = null;

        //1 iteração
        f = df.tipo_mamifero("cachorro");
        df.verifica_instancia(f);

        //2 iteração
        f = df.tipo_mamifero("puma");
        df.verifica_instancia(f);

        //3 iteração
        f = df.tipo_mamifero("onça");
        df.verifica_instancia(f);
    }
}
