package pilha_contrato;

//Stack(pilha) - Contrato(código genérico)
public interface Empilhavel {
	//Operações principais
	
	void empilhar(Object dado);		//push
	Object desempilhar();			//pop
	Object retornarTopo();			//top
	void atualizar(Object dados);	//update

	//Operações auxiliares
	Boolean estaCheia();			//isFull -> overflow
	Boolean estaVazia();			//isEmpty -> underflow
	String imprimir();				//print
}
