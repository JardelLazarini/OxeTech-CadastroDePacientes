class Medico {
    private String nome;
    private String cpf;
    private String crm;
    private double salario;
    private String especialidade;

    public Medico(String nome, String cpf, String crm, double salario, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.crm = crm;
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCrm() {
        return crm;
    }

    public double getSalario() {
        return salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
