# A Busca pelo Diamante da Sabedoria 💎

## 📋 Objetivo do Projeto

Desenvolver um jogo no estilo **Adventure RPG** que oferece liberdade de escolha, permitindo que o jogador explore, resolva enigmas e interaja com objetos e ferramentas para alcançar seu objetivo.

## 🔍 Enredo

Você é um arqueólogo de renome que parte em uma expedição em busca do **Diamante da Sabedoria**, um tesouro lendário que concede grande sabedoria e prosperidade a quem o possuir. Sua jornada o leva à mansão misteriosa de **Conde Domingos**, um excêntrico nobre que escondeu o diamante e deixou uma série de armadilhas e enigmas para garantir que apenas aqueles dignos pudessem encontrá-lo.

Você deve explorar as salas da mansão, coletar ferramentas, interagir com objetos e resolver o mistério que guarda o **Diamante da Sabedoria**.

## ⚔️ Como Funciona o Jogo

O jogo é composto por um labirinto de salas interligadas. O jogador deve coletar ferramentas, resolver enigmas e usar itens de forma estratégica para alcançar seu objetivo. O jogo também inclui uma mochila com capacidade limitada de armazenar 3 itens.

## 🎮 Comandos do Jogo

Aqui estão os comandos disponíveis para interação no jogo:

1. **fim**Encerra o jogo imediatamente.
2. **pega [ferramenta]**Pega uma ferramenta da sala e adiciona à mochila. Exemplo: `pega Lanterna`.
3. **inventario**Exibe os itens disponíveis na mochila para uso.
4. **usa [ferramenta]**Usa uma ferramenta da mochila ou da sala, conforme permitido. Exemplo: `usa Lanterna`.
5. **vai [sala]**Muda para uma sala diferente. Exemplo: `vai Biblioteca` ou `vai Cozinha`.
6. **[comando desconhecido]**
   Exibe uma mensagem de erro se o comando não for reconhecido.

### **Salas**

- **Sala de Estar**: Ponto de entrada com acesso para a Cozinha, Jardim e Biblioteca.
- **Biblioteca**: Contém estantes de livros com pistas ocultas e conecta-se à Sala de Estar e ao Quarto.
- **Quarto**: Contém pistas e objetos importantes, conecta-se ao Porão.
- **Porão**: Local onde o diamante está escondido, acessado através do Quarto.
- **Cozinha**: Contém armadilhas e pistas falsas, conecta-se à Sala de Estar e ao Jardim.
- **Jardim**: Pátio misterioso com uma estátua que guarda uma ferramenta crucial, conecta-se à Sala de Estar e à Cozinha.

### **Ferramentas**

- **Lanterna** (Biblioteca) Revela mensagens e objetos ocultos em locais escuros. Quando usada, gasta 1 nivel de bateria. Se acabar a bateria, o jogo é perdido. Usar ela com uma pilha na sala, irá recarregá-la.
- **Martelo** (Quarto): Usado para quebrar objetos, como potes e estátuas.
- **Chave de Ouro** (Oculto no Jardim): Abre o cofre onde o Diamante está escondido.
- **Lupa** (Sala de Estar): Usada para examinar a pintura do Barão e ler o livro na Biblioteca.
- **Lápis** (Oculto na Cozinha): Ferramenta não utilizada.

### **Objetos e Funcionalidades**

- **Espelho** (Biblioteca): Revela uma pista falsa quando iluminado pela lanterna.
- **Estante de Livros** (Biblioteca): Esconde um livro com uma pista essencial, visível apenas com a lanterna.
- **Livro** (Oculto na Biblioteca): O titulo da uma pista para o proximo passo, a partir da utilização da lupa.
- **Pote Misterioso** (Cozinha): Contém uma ferramenta inútil (lápis), precisa ser quebrado com o martelo.
- **Estátua do Barão** (Jardim): Revela a Chave de Ouro quando iluminada pela lanterna.
- **Cofre Pequeno** (Porão): Guardado na Sala Secreta, protegido pela Chave de Ouro, contém o Diamante da Sabedoria.
- **Pintura do Barão** (Quarto): Ao ser examinada com a lupa, revela uma sala oculta.
- **Pilha** (Sala de Estar): Recarregam a lanterna.

### **Caminho para Vencer**

1. **Biblioteca**: Use a lanterna na estante para localizar o livro com uma pista essencial para o Jardim.
2. **Jardim**: Ilumine a estátua com a lanterna para obter a Chave de Ouro.
3. **Quarto**: Examine a pintura do Barão com a lupa para revelar uma sala secreta.
4. **Porão**: Acesse a sala secreta e use a Chave de Ouro para abrir o cofre e obter o **Diamante da Sabedoria**.

### **Características e Elementos Específicos**

- **Mochila**: O jogador pode carregar até 3 itens ao mesmo tempo. A mochila é essencial para gerenciar ferramentas e objetos durante o jogo.
- **Objetos Descartáveis**: O **Pote Misterioso** pode ser descartado após ser quebrado. A **Chave de Ouro** pode ser usada apenas uma vez.
- **Controle de Energia**: A **Lanterna** possui uma carga limitada, que pode ser recarregada com pilhas.
- **Possibilidades de Derrota**: O jogador pode ficar sem pilhas e não conseguir recarregar a lanterna, impedindo o progresso.

## 🛠️ Tecnologias Utilizadas

- **IDE**: Visual Studio Code
- **Software de Versionamento**: GitHub
- **Linguagem de Programação**: Java

## 📑 Requisitos

Para rodar o jogo, você precisará dos seguintes componentes:

- **Sistema Operacional**: Windows
- **Java**: O jogo deve ser executado diretamente do código-fonte Java.
- **Extensão PlantUML**: Para visualizar o diagrama de classes, instale a extensão PlantUML em sua IDE.

## 🛠️ Como Preparar e Iniciar o Jogo

### Instale o Java Development Kit (JDK)


## 🗓️ Versão

**Versão 1.0**: 24/11/2024

## 🧑‍💻 Autores

- Augusto Fisch
- Diogo Giacoboni
- Bernardo Garcia Fensterseifer
- Julia Yume Nagahama Kriedte
- Guilherme Sanches Cavazzotto
