import java.util.ArrayList;
import java.util.Scanner;

public class ListaPacientesMedicos {
    private ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private ArrayList<Medico> listaMedicos = new ArrayList<>();
    private EspecialidadeManager especialidadeManager = new EspecialidadeManager();
    private static final Scanner scanner = new Scanner(System.in);

    public void cadastrarPaciente() {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        String cpf = obterCPF();

        System.out.print("Digite o Cartão SUS do paciente: ");
        String cartaoSUS = scanner.nextLine();

        String especialidade = obterEspecialidade("Digite a especialidade de atendimento do paciente: ");

        Paciente paciente = new Paciente(nome, cpf, cartaoSUS, especialidade);
        listaPacientes.add(paciente);

        System.out.println("Paciente cadastrado com sucesso!");
    }

    public void listarPacientes() {
        System.out.println("Lista de pacientes:");

        for (Paciente paciente : listaPacientes) {
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("CPF: " + paciente.getCpf());
            System.out.println("Cartão SUS: " + paciente.getCartaoSUS());
            System.out.println("Especialidade: " + paciente.getEspecialidade());
            System.out.println();
        }
    }

    public void cadastrarMedico() {
        String nome = obterNome("Digite o nome do médico: ");
        String cpf = obterCPF();
        String crm = obterCRM();
        double salario = obterSalario();
        String especialidade = obterEspecialidade("Digite a especialidade do médico: ");

        Medico medico = new Medico(nome, cpf, crm, salario, especialidade);
        listaMedicos.add(medico);

        System.out.println("Médico cadastrado com sucesso!");
    }

    public void listarMedicos() {
        System.out.println("Lista de médicos:");

        for (Medico medico : listaMedicos) {
            System.out.println("Nome: " + medico.getNome());
            System.out.println("CPF: " + medico.getCpf());
            System.out.println("CRM: " + medico.getCrm());
            System.out.println("Salário: " + medico.getSalario());
            System.out.println("Especialidade: " + medico.getEspecialidade());
            System.out.println();
        }
    }

    public void adicionarNovaEspecialidade() {
        System.out.print("Digite a nova especialidade: ");
        String novaEspecialidade = scanner.nextLine();

        if (especialidadeManager.verificarEspecialidade(novaEspecialidade)) {
            System.out.println("Especialidade já existe.");
        } else {
            especialidadeManager.adicionarNovaEspecialidade(novaEspecialidade);
        }
    }

    private String obterNome(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private String obterCPF() {
        String cpf;
        while (true) {
            System.out.print("Digite o CPF (formato 123.456.789-09): ");
            cpf = scanner.nextLine();
            if (validarCPF(cpf)) {
                break;
            } else {
                System.out.println("CPF inválido. Tente novamente.");
            }
        }
        return cpf;
    }

    private String obterCRM() {
        System.out.print("Digite o CRM do médico: ");
        return scanner.nextLine();
    }

    private double obterSalario() {
        System.out.print("Digite o salário do médico: ");
        return scanner.nextDouble();
    }

    private String obterEspecialidade(String mensagem) {
        // Exibir especialidades disponíveis
        System.out.println("Especialidades disponíveis:");
        especialidadeManager.getEspecialidades().forEach(System.out::println);

        String especialidade;
        while (true) {
            System.out.print(mensagem);
            especialidade = scanner.nextLine();

            if (especialidadeManager.verificarEspecialidade(especialidade)) {
                break;
            } else {
                System.out.println("Especialidade inválida. Tente novamente.");
            }
        }
        return especialidade;
    }

    private boolean validarCPF(String cpf) {
        // Implemente a lógica de validação do CPF, se necessário
        return true;
    }
}
