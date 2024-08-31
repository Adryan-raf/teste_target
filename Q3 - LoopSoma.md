## Explicação da questão número 3

```java
public class LoopSoma {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;
        
        while (k < indice) {
            k++;
            soma += k;
        }
        System.out.printf("%d", soma);
    }
}

```
### 1. Inicialização das Variáveis:

``` int indice = 12, soma = 0, k = 1; ```
<br>
- Indice é o valor limite para o loop.
- Soma é a variável onde a soma dos números será armazenada.
- k é a variável que será incrementada no loop.

### 2. Loop while
```
while (k < indice){
k++;
soma += k;
}
```
- Inicia um loop que continuará enquanto k for menor que indice.
- Incrementa o valor de k em 1.
- Adiciona o valor de k à variável soma.


### 3. Impressão do resultado
```
System.out.printf("%d", soma);
```
- Este método imprime na tela o valor armazenado na variável soma após os procedimentos do loop.

## RESULTADO APÓS AS ITERAÇÕES -> soma = 77
