package br.com.dio.desafio.dominio.menus;

import br.com.dio.desafio.dominio.models.Bootcamp;

public class CriarBootcampAction implements MenuAction {
    private final MenuContext context;

    public CriarBootcampAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        Bootcamp bootcamp = new Bootcamp();
        System.out.print("Nome do bootcamp: ");
        bootcamp.setNome(context.scanner.nextLine());
        System.out.print("Descrição: ");
        bootcamp.setDescricao(context.scanner.nextLine());
        System.out.println("Adicione cursos ao bootcamp (índices separados por espaço):");
        for (int i = 0; i < context.cursos.size(); i++)
            System.out.println(i + ": " + context.cursos.get(i).getTitulo());
        String[] indicesCursos = context.scanner.nextLine().split(" ");
        for (String idx : indicesCursos) {
            if (!idx.isEmpty()) bootcamp.getConteudos().add(context.cursos.get(Integer.parseInt(idx)));
        }
        System.out.println("Adicione mentorias ao bootcamp (índices separados por espaço):");
        for (int i = 0; i < context.mentorias.size(); i++)
            System.out.println(i + ": " + context.mentorias.get(i).getTitulo());
        String[] indicesMentorias = context.scanner.nextLine().split(" ");
        for (String idx : indicesMentorias) {
            if (!idx.isEmpty()) bootcamp.getConteudos().add(context.mentorias.get(Integer.parseInt(idx)));
        }
        context.bootcamps.add(bootcamp);
        System.out.println("Bootcamp criado!");
    }
}