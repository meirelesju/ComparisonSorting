# Comparison Sort


## Merge Sort

O Merge Sort é um algoritmo de ordenação por comparação do tipo "dividir para conquistar".

A ideia do algoritmo é dividir o array de entrada (principal) na metade em pares de subarrays até ficar apenas um elemento em cada subarray,
e a partir desses elementos, reordená-los e colocá-los novamente no array de entrada.


### Algoritmo


<img width="225" alt="Algoritmo1" src="https://user-images.githubusercontent.com/32073212/65055474-a1adbf00-d945-11e9-8fd1-824d2fd538e4.png">


![Algoritmo2](https://user-images.githubusercontent.com/32073212/65055562-c99d2280-d945-11e9-869f-e6866240721c.png)



* A variável *p* é o índice do início da lista à "esquerda";
* A variável *q* é o índice do meio da lista;
* A variável *r* é o índice do final da lista à "direita".


* Note que o algoritmo nas linhas **8** e **9** coloca um valor *infinito* no último elemento dos arrays. Ele faz isso para detectar que o mesmo chegou ao seu fim; 
Sem esses valores, precisaria de um código explícito para detectar e manipular o final das listas.


## Autores

* **Julianny Meireles** - *All work* - [Meirelesju](https://github.com/meirelesju)


## Licença

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Referências

* Merge Sort - [Wikipédia](https://pt.wikipedia.org/wiki/Merge_sort)
* Slide Share (Merge Sort) - [SlideShare](https://pt.slideshare.net/AbbasAli24/merge-sort-29574337)
* Youtube (The Merge Sort Algorithm) - [Youtube](https://www.youtube.com/watch?v=zkdwpdHLuII)
