import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class EspecialidadeManager {
    private Set<String> especialidades = new HashSet<>(Arrays.asList(
            "Cardiologia", "Ortopedia", "Clínico Geral", "Pediatra"
    ));

    public boolean verificarEspecialidade(String especialidade) {
        return especialidades.contains(especialidade);
    }

    public Set<String> getEspecialidades() {
        return Collections.unmodifiableSet(especialidades);
    }

    public void adicionarNovaEspecialidade(String especialidade) {
        especialidades.add(especialidade);
        System.out.println("Especialidade adicionada com sucesso!");
    }
}