public class Enfermagem extends Participante{
    public Enfermagem(MediadorClinica mediador) {
        super(mediador, "Enfermagem");
    }

    @Override
    public void enviar(String mensagem) {
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Enfermagem recebeu] " + mensagem);
    }
}