import br.com.dio.desafio.dominio.menus.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MenuContext context = new MenuContext();

        Map<Integer, MenuAction> actions = new HashMap<>();
        actions.put(1, new CriarCursoAction(context));
        actions.put(2, new CriarMentoriaAction(context));
        actions.put(3, new CriarBootcampAction(context));
        actions.put(4, new InscreverDevAction(context));
        actions.put(5, new ProgredirDevAction(context));
        actions.put(6, new ListarDevsAction(context));
        actions.put(7, new MostrarCursosAction(context)); // Nova opção para mostrar cursos

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Criar Curso");
            System.out.println("2. Criar Mentoria");
            System.out.println("3. Criar Bootcamp");
            System.out.println("4. Inscrever Dev em Bootcamp");
            System.out.println("5. Progredir Dev");
            System.out.println("6. Listar Devs e Progresso");
            System.out.println("7. Mostrar todos os Cursos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = context.scanner.nextInt();
            context.scanner.nextLine();

            if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                MenuAction action = actions.get(opcao);
                if (action != null) {
                    action.execute();
                } else {
                    System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);
    }
}