public class Medico extends Participante{
    public Medico(MediadorClinica mediador) {
        super(mediador, "Médico");
    }

    @Override
    public void enviar(String mensagem) {
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Médico recebeu] " + mensagem);
    }
}