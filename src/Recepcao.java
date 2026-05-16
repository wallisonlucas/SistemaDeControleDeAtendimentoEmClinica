public class Recepcao extends Participante{
    public Recepcao(MediadorClinica mediador) {
        super(mediador, "Recepção");
    }

    @Override
    public void enviar(String mensagem) {
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Recepção recebeu] " + mensagem);
    }
}