package br.com.dio.desafio.dominio.menus;

import br.com.dio.desafio.dominio.models.Conteudo;
import br.com.dio.desafio.dominio.models.Dev;

public class ListarDevsAction implements MenuAction {
    private final MenuContext context;

    public ListarDevsAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        for (Dev dev : context.devs) {
            System.out.println("Dev: " + dev.getNome());
            System.out.println("Inscritos: ");
            for (Conteudo c : dev.getConteudosInscritos())
                System.out.println(" - " + c.getTitulo());
            System.out.println("Concluídos: ");
            for (Conteudo c : dev.getConteudosConcluidos())
                System.out.println(" - " + c.getTitulo());
            System.out.println("XP: " + dev.calcularTotalXp());
            System.out.println("-----");
        }
    }
}