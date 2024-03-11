import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Consulta {

    String nomePaciente;
    String date;
    String especialidade;
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Consulta> listaConsultas = new ArrayList<>();

    public Consulta (String nomePaciente, String date, String especialidade) {
        this.nomePaciente = nomePaciente;
        this.date = date;
        this.especialidade = especialidade;

    }


    public static void agendarConsulta() {
        String mensagem;
        System.out.println("Especialidades disponíveis: Pediatra\n" +
                "Ortopedia\n" +
                "Clínico Geral\n" +
                "Cardiologia");
        System.out.print("Digite a especialidade desejada: ");
        mensagem = scanner.nextLine();
        String nome;
        System.out.print("Digite o nome do paciente: ");
        nome = scanner.nextLine();
        String date;
        System.out.print("Qual a data desejada? Digite no formato (dd/mm/yyyy): ");
        date = scanner.nextLine();
        Consulta c1 = new Consulta(nome, date, mensagem);
        listaConsultas.add(c1);
        System.out.println("Consulta marcada com sucesso!");
    }

    public static void listarConsultas(){
        if (listaConsultas.isEmpty()) {
            System.out.println("Não existem consultadas registradas");
        } else {
            for (Consulta consultas: listaConsultas) {
                System.out.println("ID: " + (listaConsultas.indexOf(consultas) + 1) + "\n Nome: " + consultas.getNome() + "\n Data: " + consultas.getDate() + "\n Especialidade: " + consultas.getEspecialidade());
            }
        }
    }

    public String getNome() {
        return nomePaciente;
    }

    public String getDate(){
        return date;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    }

