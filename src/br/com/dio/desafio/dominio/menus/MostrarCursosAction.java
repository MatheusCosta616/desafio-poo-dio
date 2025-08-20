package br.com.dio.desafio.dominio.menus;

import br.com.dio.desafio.dominio.models.Curso;

public class MostrarCursosAction implements MenuAction {
    private final MenuContext context;

    public MostrarCursosAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        if (context.cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            System.out.println("\n--- Lista de Cursos ---");
            for (int i = 0; i < context.cursos.size(); i++) {
                Curso curso = context.cursos.get(i);
                System.out.println((i) + ": " + curso);
            }
        }
    }
}