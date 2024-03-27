package projects.template;

import sinalgo.nodes.messages.Message;

public class PingPongMessage extends Message{
	
	private int r,g,b;
	
	public PingPongMessage(int i, int j, int k) {
		this.r = i;
		this.g = k;
		this.b = k;
	}
	
	
	
	//getters and setters
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	//geramos uma cópia da mensagem
	@Override
	public Message clone() {
		
		return new PingPongMessage(this.r, this.g, this.b);
	}
}
