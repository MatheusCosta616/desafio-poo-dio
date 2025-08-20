package br.com.dio.desafio.dominio.menus;


public class ProgredirDevAction implements MenuAction {
    private final MenuContext context;

    public ProgredirDevAction(MenuContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        if (context.devs.isEmpty()) {
            System.out.println("Nenhum dev cadastrado.");
            return;
        }
        System.out.println("Escolha o dev para progredir:");
        for (int i = 0; i < context.devs.size(); i++)
            System.out.println(i + ": " + context.devs.get(i).getNome());
        int idx = context.scanner.nextInt();
        context.scanner.nextLine();
        context.devs.get(idx).progredir();
        System.out.println("Progresso realizado!");
    }
}