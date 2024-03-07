class Paciente {
    private String nome;
    private String cpf;
    private String cartaoSUS;
    private String especialidade;

    public Paciente(String nome, String cpf, String cartaoSUS, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartaoSUS = cartaoSUS;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCartaoSUS() {
        return cartaoSUS;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
