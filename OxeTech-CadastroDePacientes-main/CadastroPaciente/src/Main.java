import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ListaPacientesMedicos lista = new ListaPacientesMedicos();

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Enter

            switch (escolha) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    listarPacientes();
                    break;
                case 3:
                    cadastrarMedico();
                    break;
                case 4:
                    listarMedicos();
                    break;
                case 5:
                    agendar();
                    break;
                case 6:
                    listar();
                    break;
                case 7:
                    adicionarNovaEspecialidade();
                    break;       
                case 8:
                    deletarPaciente();
                    break;
                case 9:
                    deletarMedico();
                    break;
                case 10:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n1. Cadastrar paciente");
        System.out.println("2. Listar pacientes");
        System.out.println("3. Cadastrar médico");
        System.out.println("4. Listar médicos");
        System.out.println("5. Agendar consultas");
        System.out.println("6. Listar consultas");
        System.out.println("7. Adicionar nova especialidade");
        System.out.println("8. Deletar paciente");
        System.out.println("9. Deletar médico");
        System.out.println("10. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarPaciente() {
        lista.cadastrarPaciente();
    }

    private static void listarPacientes() {
        lista.listarPacientes();
    }

    private static void cadastrarMedico() {
        lista.cadastrarMedico();
    }

    private static void listarMedicos() {
        lista.listarMedicos();
    }

    private static void adicionarNovaEspecialidade() {
        lista.adicionarNovaEspecialidade();
    }

    private static void agendar() {
        Consulta.agendarConsulta();
    }

    private static void listar() {
        Consulta.listarConsultas();
    }

    private static void deletarPaciente() {
        lista.deletarPaciente();
    }

    private static void deletarMedico() {
        lista.deletarMedico();
    }
}
