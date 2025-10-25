# TDE 3 - Ordenação

## Descrição do Trabalho

Este trabalho consiste na implementação e análise comparativa de seis algoritmos de ordenação aplicados sobre três vetores com características distintas. O objetivo é avaliar o desempenho de cada algoritmo em diferentes cenários de ordenação.

## Objetivos

- Implementar os algoritmos Comb Sort, Gnome Sort e Bucket Sort
- Comparar seu desempenho com Bubble Sort, Selection Sort e Cocktail Sort
- Analisar métricas de desempenho: trocas, iterações e tempo de execução
- Identificar os algoritmos mais eficientes para cada tipo de vetor

## Algoritmos Implementados

### 1. **Bubble Sort**
- **Complexidade**: O(n²) no pior caso, O(n) no melhor caso
- **Estabilidade**: Estável
- **Funcionamento**: Compara elementos adjacentes e os troca se estiverem na ordem errada

### 2. **Selection Sort**
- **Complexidade**: O(n²) em todos os casos
- **Estabilidade**: Instável
- **Funcionamento**: Seleciona o menor elemento e coloca na posição correta

### 3. **Cocktail Sort**
- **Complexidade**: O(n²) no pior caso, O(n) no melhor caso
- **Estabilidade**: Estável
- **Funcionamento**: Bubble Sort bidirecional que percorre a lista em ambas as direções

### 4. **Comb Sort**
- **Complexidade**: O(n²) no pior caso, O(n log n) no caso médio
- **Estabilidade**: Instável
- **Funcionamento**: Melhoria do Bubble Sort usando gaps que diminuem progressivamente

### 5. **Gnome Sort**
- **Complexidade**: O(n²)
- **Estabilidade**: Estável
- **Funcionamento**: Similar ao Insertion Sort mas usando trocas sucessivas como o Bubble Sort

### 6. **Bucket Sort**
- **Complexidade**: O(n + k) onde k é o número de buckets
- **Estabilidade**: Estável (depende do algoritmo usado nos buckets)
- **Funcionamento**: Distribui elementos em buckets e ordena cada bucket individualmente

## Metodologia de Teste

### Vetores de Teste

**VETOR1** - Array aleatório:
```
[12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28]
```

**VETOR2** - Array já ordenado:
```
[5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32]
```

**VETOR3** - Array inversamente ordenado:
```
[99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6]
```

### Métricas Avaliadas

- **Trocas**: Número de trocas entre elementos
- **Iterações**: Número total de iterações nos loops
- **Tempo**: Tempo de execução em nanosegundos

## Resultados Obtidos

### Médias de 3 Rodadas

#### VETOR1 (Array Aleatório)

| Algoritmo          | Trocas | Iterações | Tempo (ns) |
|--------------------|--------|-----------|------------|
| **Comb Sort**      | 22     | 129       | 13.299     |
| **Selection Sort** | 18     | 209       | 16.647     |
| **Bucket Sort**    | 14     | 114       | 1.277.561  |
| Cocktail Sort      | 78     | 154       | 19.222     |
| Gnome Sort         | 78     | 176       | 19.099     |
| Bubble Sort        | 78     | 180       | 24.632     |

#### VETOR2 (Array Ordenado)

| Algoritmo         | Trocas | Iterações | Tempo (ns) |
|-------------------|--------|-----------|------------|
| **Cocktail Sort** | 0      | 19        | 1.974      |
| **Bubble Sort**   | 0      | 19        | 2.501      |
| **Gnome Sort**    | 0      | 20        | 2.405      |
| Comb Sort         | 0      | 110       | 8.790      |
| Selection Sort    | 0      | 209       | 14.750     |
| Bucket Sort       | 32     | 229       | 65.260     |

#### VETOR3 (Array Inverso)

| Algoritmo          | Trocas | Iterações | Tempo (ns) |
|--------------------|--------|-----------|------------|
| **Comb Sort**      | 18     | 129       | 12.339     |
| **Selection Sort** | 10     | 209       | 16.751     |
| **Bucket Sort**    | 32     | 318       | 35.586     |
| Bubble Sort        | 190    | 190       | 26.810     |
| Cocktail Sort      | 190    | 190       | 27.698     |
| Gnome Sort         | 190    | 400       | 41.804     |

## Ranking por Categoria

### Por Menor Número de Trocas

| Posição | VETOR1 | VETOR2 | VETOR3 |
|---------|--------|--------|--------|
| 1º | Bucket Sort (14) | Cocktail/Bubble/Gnome (0) | Selection Sort (10) |
| 2º | Selection Sort (18) | Comb/Selection (0) | Comb Sort (18) |
| 3º | Comb Sort (22) | Bucket Sort (32) | Bucket Sort (32) |

### Por Menor Número de Iterações

| Posição | VETOR1 | VETOR2 | VETOR3 |
|---------|--------|--------|--------|
| 1º | Bucket Sort (114) | Cocktail/Bubble (19) | Comb Sort (129) |
| 2º | Comb Sort (129) | Gnome Sort (20) | Bubble/Cocktail (190) |
| 3º | Cocktail Sort (154) | Comb Sort (110) | Selection Sort (209) |

### Por Menor Tempo de Execução

| Posição | VETOR1 | VETOR2 | VETOR3 |
|---------|--------|--------|--------|
| 1º | Comb Sort (13.299ns) | Cocktail Sort (1.974ns) | Comb Sort (12.339ns) |
| 2º | Selection Sort (16.647ns) | Bubble Sort (2.501ns) | Bucket Sort (35.586ns) |
| 3º | Gnome Sort (19.099ns) | Gnome Sort (2.405ns) | Selection Sort (16.751ns) |

## Análise Detalhada

### Comb Sort
**Vantagens:**
- Excelente performance em arrays aleatórios e inversos
- Número consistente de iterações independente da ordenação inicial
- Boa relação entre trocas e iterações

**Desvantagens:**
- Performance inferior em arrays já ordenados comparado a algoritmos adaptativos

**Melhor Aplicação:** Arrays grandes e desordenados

### Selection Sort
**Vantagens:**
- Número mínimo de trocas (O(n))
- Performance consistente independente da ordenação inicial
- Simples implementação

**Desvantagens:**
- Número fixo e alto de iterações (O(n²))
- Não adaptativo

**Melhor Aplicação:** Arrays pequenos ou quando trocas são custosas

### Bucket Sort
**Vantagens:**
- Excelente quando a distribuição dos dados é uniforme
- Poucas trocas em arrays aleatórios

**Desvantagens:**
- Performance inconsistente (muito lento no VETOR1)
- Overhead de memória para os buckets
- Depende do algoritmo de ordenação usado nos buckets (aqui usado Bubble Sort)

**Melhor Aplicação:** Dados com distribuição uniforme conhecida

### Cocktail Sort
**Vantagens:**
- Excelente performance em arrays já ordenados
- Melhora o Bubble Sort eliminando o problema da "Tartaruga" (*Turtle Problem*, onde um valor pequeno no final da lista necessita de muitas iterações para ser ordenado, se movendo 1 posição por passada)

**Desvantagens:**
- Performance ruim em arrays inversos
- Muitas trocas em arrays desordenados

**Melhor Aplicação:** Arrays quase ordenados

### Gnome Sort
**Vantagens:**
- Implementação extremamente simples
- Boa performance em arrays ordenados

**Desvantagens:**
- Performance muito ruim em arrays inversos (O(n²))
- Muitas iterações e trocas em casos desfavoráveis

**Melhor Aplicação:** Arrays pequenos e quase ordenados

### Bubble Sort
**Vantagens:**
- Implementação simples
- Bom performance em arrays ordenados com flag de parada

**Desvantagens:**
- Performance O(n²) na maioria dos casos
- Muitas trocas e iterações

**Melhor Aplicação:** Arrays pequenos

## Conclusões

1. **Comb Sort** demonstrou ser o algoritmo mais equilibrado, com boa performance em todos os cenários
2. **Selection Sort** é ideal quando o custo de trocas é alto, mantendo número mínimo de trocas
3. **Bucket Sort** teve performance inconsistente, sendo muito dependente da distribuição dos dados
4. Algoritmos adaptativos como **Cocktail Sort** são excelentes para arrays já ordenados ou quase ordenados
5. **Gnome Sort** e **Bubble Sort** são mais indicados para fins educacionais ou arrays muito pequenos

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Métricas**: Trocas, Iterações, Tempo de execução (nanosegundos)
- **Ambiente**: Java SE
- **Metodologia**: Testes repetidos (3 rodadas) para maior confiabilidade

## Estrutura do Projeto

```
src/
├── sort/
│   ├── AlgoritmoSort.java
│   ├── BubbleSort.java
│   ├── SelectionSort.java
│   ├── CocktailSort.java
│   ├── CombSort.java
│   ├── GnomeSort.java
│   └── BucketSort.java
├── util/
│   ├── Util.java
│   ├── Node.java
│   └── Lista.java
└── Main.java
```

## Como Executar

Abrir no IntelliJ IDEA ou outra IDE para Java e executar o arquivo `Main`.

## Explicação do Código

### Estrutura Principal

O projeto segue uma arquitetura modular com classes organizadas em pacotes:

- **`sort`**: Contém todas as implementações dos algoritmos de ordenação
- **`util`**: Classes utilitárias para manipulação de arrays e listas
- **`Main`**: Classe principal que orquestra os testes

### Classes de Ordenação

Todas as classes de ordenação herdam da classe abstrata `AlgoritmoSort`:

```java
public abstract class AlgoritmoSort {
    public abstract void ordenar(int tam, int[] v);
}
```

### Implementações dos Algoritmos

#### Comb Sort
```java
public class CombSort extends AlgoritmoSort {
    public void ordenar(int tam, int[] v) {
        int gap = tam;
        boolean trocou = true;
        
        while (gap != 1 || trocou) {
            gap = (gap * 10) / 13;  // Fator de redução do gap
            if (gap < 1) gap = 1;
            
            trocou = false;
            for (int i = 0; i < tam - gap; i++) {
                if (vetor[i] > vetor[i + gap]) {
                    // Troca os elementos
                    trocou = true;
                }
            }
        }
    }
}
```

#### Bucket Sort
```java
public class BucketSort extends AlgoritmoSort {
    public void ordenar(int tam, int[] v) {
        // 1. Encontrar valor máximo para determinar o range
        // 2. Criar buckets baseado no range
        // 3. Distribuir elementos nos buckets
        // 4. Ordenar cada bucket com Bubble Sort
        // 5. Concatenar buckets ordenados
    }
    
    private void bubbleSortLista(Lista lista) {
        // Implementação do Bubble Sort para listas encadeadas
    }
}
```

#### Gnome Sort
```java
public class GnomeSort extends AlgoritmoSort {
    public void ordenar(int tam, int[] v) {
        int i = 0;
        while (i < tam) {
            if (i == 0 || vetor[i] >= vetor[i - 1]) {
                i++;  // Avança quando está na posição correta
            } else {
                // Troca e retrocede
                int tmp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = tmp;
                i--;
            }
        }
    }
}
```

### Classes Utilitárias

#### Lista Encadeada
```java
public class Lista {
    private Node cabeca;
    private int tamanho;
    
    public void inserir(int k) {
        // Insere no início da lista
        Node n = new Node(k);
        n.setProx(this.cabeca);
        this.cabeca = n;
        tamanho++;
    }
}
```

#### Node
```java
public class Node {
    private Node prox;
    private int chave;
    // Getters e Setters
}
```

#### Util
```java
public final class Util {
    public static String arrayParaString(int tam, int[] arr) {
        // Converte array para string formatada
    }
    
    public static int[] copiarArray(int[] arr, int tam) {
        // Cria cópia do array para não modificar o original
    }
}
```

### Métricas de Desempenho

Cada algoritmo implementa o rastreamento de:
- **Trocas**: Contador incrementado a cada troca de elementos
- **Iterações**: Contador incrementado a cada iteração de loop
- **Tempo**: Medido usando `System.nanoTime()` antes e depois da execução

### Execução dos Testes

A classe `Main` executa todos os algoritmos nos três vetores de teste:

```java
public class Main {
    public static void main(String[] args) {
        final int[][] vetores = {vetor1, vetor2, vetor3};
        final AlgoritmoSort[] sorts = {
            new BubbleSort(), new SelectionSort(), new CocktailSort(),
            new CombSort(), new GnomeSort(), new BucketSort()
        };
        
        // Executa cada algoritmo em cada vetor
        for (int i = 0; i < vetores.length; i++) {
            for (int j = 0; j < sorts.length; j++) {
                sorts[j].ordenar(TAM_VETORES, vetores[i]);
            }
        }
    }
}
```

### Características de Implementação

1. **Cópia de Arrays**: Cada algoritmo trabalha com cópia do array original para garantir isolamento
2. **Contadores Locais**: Cada algoritmo mantém seus próprios contadores de desempenho
3. **Saída Formatada**: Resultados são exibidos de forma consistente e legível
4. **Encapsulamento**: Estruturas de dados auxiliares são encapsuladas em classes específicas

---

**Autor:** Renan da Silva Oliveira Andrade  
**Data:** 29/10/2025  
**Disciplina:** Resolução de Problemas Estruturados em Computação  
**Orientador:** Andrey Cabral Meira