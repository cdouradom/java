package operadores;

public class Unario {

	public static void main(String[] args) {
		//
		
		int preIncrementoOriginal = 8, preIncrementoResultado; // 
		int posIncrementoOriginal = 8, posIncrementoResultado; //
		
		System.out.printf("Pré incremento: valor original = %d\n", preIncrementoOriginal); //
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("\nApós pré incrementar a variável original: resultado = %d, Valor Atulizado = %d\n", preIncrementoOriginal, preIncrementoOriginal); //

		System.out.println();
		
		System.out.printf("Pós incremento: valor original = %d\n", posIncrementoOriginal); //
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("\nApós pós incrementar a variável original: resultado = %d, Valor Atulizado = %d\n", posIncrementoResultado, posIncrementoOriginal); 
		
	}

}
