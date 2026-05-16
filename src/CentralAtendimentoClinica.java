public class CentralAtendimentoClinica implements MediadorClinica {

    private Recepcao recepcao;
    private Medico medico;
    private Enfermagem enfermagem;
    private Laboratorio laboratorio;
    private Paciente paciente;

    public void setRecepcao(Recepcao recepcao) {
        this.recepcao = recepcao;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setEnfermagem(Enfermagem enfermagem) {
        this.enfermagem = enfermagem;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void enviarMensagem(String mensagem, Participante remetente) {

        System.out.println("\n[CENTRAL] Mensagem recebida de " + remetente.nome + ": " + mensagem
        );

        if (remetente instanceof Paciente) {
            recepcao.receber("Paciente chegou para atendimento.");

        } else if (remetente instanceof Recepcao) {

            if (mensagem.toLowerCase().contains("encaminhado")) {
                medico.receber("Paciente aguardando consulta.");
            }

            if (mensagem.toLowerCase().contains("finalizado")) {
                paciente.receber("Seu atendimento foi finalizado.");
            }

        } else if (remetente instanceof Medico) {

            if (mensagem.toLowerCase().contains("exame")) {
                laboratorio.receber("Realizar exame solicitado pelo médico.");
            }

            if (mensagem.toLowerCase().contains("preparar")) {
                enfermagem.receber("Preparar paciente para procedimento.");
            }

        } else if (remetente instanceof Laboratorio) {
            medico.receber("Resultado do exame disponível.");

        } else if (remetente instanceof Enfermagem) {
            medico.receber("Paciente preparado.");
        }
    }
}