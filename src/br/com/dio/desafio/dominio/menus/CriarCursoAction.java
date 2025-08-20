package br.com.dio.desafio.dominio.menus;


import br.com.dio.desafio.dominio.models.Curso;

public class CriarCursoAction implements MenuAction {
    private final MenuContext context;

    public CriarCursoAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        Curso curso = new Curso();
        System.out.print("Título do curso: ");
        curso.setTitulo(context.scanner.nextLine());
        System.out.print("Descrição: ");
        curso.setDescricao(context.scanner.nextLine());
        System.out.print("Carga horária: ");
        curso.setCargaHoraria(context.scanner.nextInt());
        context.scanner.nextLine();
        context.cursos.add(curso);
        System.out.println("Curso criado!");
    }
}