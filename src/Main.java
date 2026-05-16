public class Main {
    public static void main(String[] args) {
        CentralAtendimentoClinica central = new CentralAtendimentoClinica();

        Recepcao recepcao = new Recepcao(central);
        Medico medico = new Medico(central);
        Enfermagem enfermagem = new Enfermagem(central);
        Laboratorio laboratorio = new Laboratorio(central);
        Paciente paciente = new Paciente(central, "Carlos");

        central.setRecepcao(recepcao);
        central.setMedico(medico);
        central.setEnfermagem(enfermagem);
        central.setLaboratorio(laboratorio);
        central.setPaciente(paciente);
        System.out.println("========================================================================");
        paciente.enviar("Cheguei para atendimento.");
        recepcao.enviar("Paciente encaminhado ao médico.");
        medico.enviar("Solicitar exame de sangue.");
        laboratorio.enviar("Exame concluído.");
        medico.enviar("Preparar paciente para procedimento.");
        enfermagem.enviar("Paciente preparado.");
        recepcao.enviar("Atendimento finalizado.");
        System.out.println("========================================================================");
    }
}