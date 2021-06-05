package ExerciciosLacosRepeticao;
/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
*/
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i = 1,sexo, idade,totId40 = 0, totId18 = 0, emoc, mNerv = 0, hNerv=0, pNerv= 0, mCalm = 0;
		int hCalm = 0, pCalm =0,  hAgre = 0,mAgre = 0, pAgre = 0, totPs = 0;
		
		while(i<=150) { // Começo do Laço While
			System.out.println("Informe o seu sexo: " + "\n1 - feminino" + " 2 - masculino" +
			" 3 - Outros");
			sexo = sc.nextInt();
			
			System.out.println("Informe a sua idade: ");
			idade = sc.nextInt();
			
			System.out.println("Digite uma opção correspondente a sua caracteristica psicológica:" + 
			"\n1 - Calmo(a)" + " 2 - nervoso(a)" + " 3 - agressivo(a)");
			emoc = sc.nextInt();
			
			if(sexo == 1) {//Sexo feminino
				if(emoc == 1) {
					mCalm += 1;
				}else if(emoc == 2) {
					mNerv += 1;
				}else if(emoc == 3) {
				mAgre += 1;
			}
				
				//Fim
				}
			else if(sexo == 2) {//Sexo Masculino
					if(emoc == 1) {
						hCalm += 1;
					}else if(emoc == 2) {
						hNerv += 1;
					}else if(emoc == 3) {
					hAgre += 1;
				}
					
			//Fim
			}
			else if(sexo == 3) {//Sexo - Outros
				if(emoc == 1) {
					pCalm += 1;
				}else if(emoc == 2) {
					pNerv += 1;
				}else if(emoc == 3) {
				pAgre += 1;
			}
				
		//Fim
				}
			
			if(idade > 40) {//Idade 40
				if(emoc == 2) {
					totId40 +=1;
				}
			//Fim idade
			}
			else if(idade < 18){//Idade 18
				if(emoc == 1) {
					totId18 +=1;
				}
			//Fim
				}
			
			i++;
		//Fim - Laço While
			}
		
		totPs = mCalm + hCalm + pCalm;
		
		System.out.println("O número total de pessoas calmas é de: " + totPs);
		System.out.println("O número total de mulheres nervosas é de: " + mNerv);
		System.out.println("O número total de homens agressivos é de: " + hAgre);
		System.out.println("O número total de outros calmos é de: " + pCalm);
		System.out.println("O número total de pessoas nervosas com mais de 40, é de: " + totId40);
		System.out.println("O número total de pessoas calmas com menos de 18, é de: " + totId18);
		
	}
	
}
