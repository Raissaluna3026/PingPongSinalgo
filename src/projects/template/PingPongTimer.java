package projects.template;

import sinalgo.nodes.timers.Timer;

public class PingPongTimer extends Timer{
	private PingPongMessage pkt = null;
	public PingPongTimer(PingPongMessage pkt) {
		this.pkt = pkt;
	}
	@Override
	public void fire() {
		((PingPongNode)node).broadcast(this.pkt);
		//toda vez que o temporizador for disparado, ou seja, quando fire() for executado
		//o metodo broadcast do nó que iniciou o temporizador sera disparado para enviar a mensagem
	}
	public void startRelative(int relativeTime, PingPongNode n) {
		// TODO Auto-generated method stub
		
	}
	
}
