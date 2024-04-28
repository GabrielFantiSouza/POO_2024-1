Refatoração de Trens - Gabriel Fanti de Souza e Thais Kliemann Alexandre

Novas implementações no exerício do sistema de Trens:
    - Utilização de ArrayLists(anteriormente foi utilizado Vetores);
    - Utilização de uma classe abstrata;
    - Utilização do princípio de Herança para criar construtores de diversas classes, poupando e melhorando o desempenho do código.

    Vantagens:
Com a utilização de ArrayLists ao invés de Vetores, foi notório a melhora da implementação dos métodos, com a utilização de vetores, foi resolvido diversos problemas, principalemente na manipulação de dados quando se diz aos tamanhos da listas(.length para arrays, e .size()para ArrayLists), visto que quando utilizado arraylists tudo se tornou muito mais simples.
A utilização da classe abstrata alinhado com a herança facilitou a leitura e correção do código. No presente exercício, foi utilizado a classe CarroFerroviario como abstrata, de modo que as classes Locomotiva e Vagao pudessem herdar os métodos e atributos da classe "pai".
    
    Desvantagens:
De modo geral, nao foi observado desvantagens, visto que o código fica muito mais limpo e de melhor organização. Unica parte que foi um pouco difícil, foi realmente implementar a Herança e Polimorfismo. Por mais que tenha sido visto e exercitado em aula, ainda assim tivemos algumas dificuldades de utilizar esses princípios da POO.

    Conclusão:
Utilizar os princípios da POO, é melhor, e faz com que seu código fique mais Interessante e "profissional".