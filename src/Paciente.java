public class Paciente extends Participante{
    public Paciente(MediadorClinica mediador, String nomePaciente) {
        super(mediador, nomePaciente);
    }

    @Override
    public void enviar(String mensagem) {
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Paciente recebeu] " + mensagem);
    }
}