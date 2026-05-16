public class Laboratorio extends Participante{
    public Laboratorio(MediadorClinica mediador) {
        super(mediador, "Laboratório");
    }

    @Override
    public void enviar(String mensagem) {
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Laboratório recebeu] " + mensagem);
    }
}