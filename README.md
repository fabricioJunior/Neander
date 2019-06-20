# Neander
Trabalho de arquitetura e organização de computadores(UFC-SOBRAL) 

## Instruções 
Código|Instrução|Operação.
------|---------|-----------:
0000 	|NOP 	    | Nenhuma operação.
0001 	|STA end | Armazena acumulador no endereço “end” da memória.
0010 	|LDA end | Carrega o acumulador com o conteúdo do endereço “end” da memória.
0011 	|ADD end | Soma o conteúdo do endereço “end” da memória ao acumulador.
0100 	|OR  end | Efetua operação lógica “OU” do conteúdo do endereço “end” da memória ao acumulador.
0101 	|AND end | Efetua operação lógica “E” do conteúdo do endereço “end” da memória ao acumulador.
0110 	|NOT 	   | Inverte todos os bits do acumulador.
1000 	|JMP end | Desvio incondicional para o endereço “end” da memória.
1001 	|JN  end | Desvio condicional, se “N=1”, para o endereço “end” da memória.
1010 	|JZ  end | Desvio condicional, se “Z=1”, para o endereço “end” da memória.
1111 	|HLT     | Para o ciclo de busca-decodificação-execução.
