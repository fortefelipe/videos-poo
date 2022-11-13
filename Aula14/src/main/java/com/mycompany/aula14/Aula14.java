package com.mycompany.aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de Java");
        v[2] = new Video("Aula 3 de Python");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto ("Jubileuza", 14, "F", "jubi");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0],v[0]);
        vis[1].avaliar(88.0f);
        System.out.println(vis[1].toString());
        
        
        
        /*System.out.println("VÍDEOS\n~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("");
        System.out.println("GAFANHOTOS\n~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
