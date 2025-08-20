package br.com.dio.desafio.dominio.menus;

import br.com.dio.desafio.dominio.models.Dev;

public class InscreverDevAction implements MenuAction {
    private final MenuContext context;

    public InscreverDevAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        System.out.print("Nome do dev: ");
        String nome = context.scanner.nextLine();
        Dev dev = new Dev();
        dev.setNome(nome);
        System.out.println("Escolha o bootcamp para inscrever:");
        for (int i = 0; i < context.bootcamps.size(); i++)
            System.out.println(i + ": " + context.bootcamps.get(i).getNome());
        int idx = context.scanner.nextInt();
        context.scanner.nextLine();
        dev.inscreverBootcamp(context.bootcamps.get(idx));
        context.devs.add(dev);
        System.out.println("Dev inscrito!");
    }
}