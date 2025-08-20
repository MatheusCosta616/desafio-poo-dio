package br.com.dio.desafio.dominio.menus;

import br.com.dio.desafio.dominio.models.Mentoria;

import java.time.LocalDate;

public class CriarMentoriaAction implements MenuAction {
    private final MenuContext context;

    public CriarMentoriaAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        Mentoria mentoria = new Mentoria();
        System.out.print("Título da mentoria: ");
        mentoria.setTitulo(context.scanner.nextLine());
        System.out.print("Descrição: ");
        mentoria.setDescricao(context.scanner.nextLine());
        mentoria.setData(LocalDate.now());
        context.mentorias.add(mentoria);
        System.out.println("Mentoria criada!");
    }
}