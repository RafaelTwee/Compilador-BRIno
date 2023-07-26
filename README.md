# Brino - Linguagem de Programação para Arduino em Português

## Descrição

Brino é uma linguagem de programação desenvolvida para facilitar a programação de placas Arduino, utilizando uma sintaxe em português que torna o código mais legível e acessível para iniciantes.

## Principais Funções

### Declarar Variáveis

Para declarar variáveis em Brino, você pode utilizar as palavras-chave `inteiro`, `real`, `binario` e `texto`, seguidas do nome da variável e do valor atribuído. Por exemplo:

```brino
inteiro contador = 0
real temperatura = 25.5
binario ledLigado = verdadeiro
texto mensagem = 'Olá, mundo!'
```

### Comandos de Controle

#### Repetir

O comando `repetir` permite criar um loop que executa um bloco de código um número determinado de vezes. Por exemplo:

```brino
repetir(5) {
    // Bloco de código a ser repetido 5 vezes
}
```

#### Esperar

O comando `esperar` pausa a execução do programa por um tempo determinado, em milissegundos. Por exemplo:

```brino
esperar(1000); // Espera 1 segundo
```

### Comandos de Controle de Saída e Entrada

#### Ligando e Desligando

Para controlar pinos digitais (saída), você pode utilizar os comandos `ligar` e `desligar`. Por exemplo:

```brino
ligar(13)   // Liga o pino digital 13
desligar(9) // Desliga o pino digital 9
```

#### Modo do Pino

Para definir o modo de um pino digital (entrada ou saída), você pode utilizar o comando `pinmode`. Por exemplo:

```brino
modoPino(2, saida)   // Define o pino 2 como saída
modoPino(7, entrada) // Define o pino 7 como entrada
```

### Comandos de Entrada e Saída Analógica

#### Ler Analógico

O comando `lerAnalog` permite ler um valor analógico de um pino específico. O valor lido será armazenado em uma variável. Por exemplo:

```brino
inteiro valorLido = lerAnalog(A0); // Lê o valor analógico do pino A0
```

#### Escrever Analógico

O comando `escreverAnalog` permite escrever um valor analógico em um pino PWM (Pulse-Width Modulation). Por exemplo:

```brino
escreverAnalog(9, 128); // Escreve o valor analógico 128 no pino PWM 9
```

### Importar Bibliotecas

Você pode importar bibliotecas Arduino no formato `importar nomedabiblioteca` para utilizar funções adicionais. Por exemplo:

```brino
importar Servo; // Importa a biblioteca Servo para controlar servos motores
```

## Conclusão

Brino é uma linguagem de programação em português que torna a programação para Arduino mais simples e acessível para todos, especialmente para iniciantes. Ela oferece comandos familiares e fácil integração com bibliotecas Arduino, permitindo que você desenvolva projetos incríveis com facilidade.
