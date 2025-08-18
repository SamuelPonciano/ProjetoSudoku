# 🧩 Sudoku em Java com Interface Gráfica (Swing)

Este projeto é uma implementação do clássico jogo **Sudoku**, desenvolvido em **Java** utilizando a biblioteca **Swing** para interface gráfica.  
O objetivo é oferecer uma experiência interativa onde o usuário pode jogar, validar e finalizar partidas de Sudoku diretamente no computador.  

---

## 🎮 Funcionalidades Principais

- **Tabuleiro 9x9** dividido em 9 setores (3x3), representando a estrutura clássica do Sudoku.  
- **Entrada de números** via campos customizados (`NumberText`) em cada célula.  
- **Botão Resetar Jogo** → Permite reiniciar a partida do zero.  
- **Botão Verificar Status** → Informa se o jogo está:  
  - Não iniciado  
  - Incompleto  
  - Completo (com ou sem erros)  
- **Botão Finalizar Jogo** → Confere se o tabuleiro foi concluído corretamente.  
- **Mensagens de feedback** para o jogador, exibindo o status ou congratulações quando o jogo é finalizado com sucesso.  

---

## 🛠 Estrutura do Projeto

- **MainScreen** → Classe principal responsável por montar a tela do jogo, organizar os setores e adicionar os botões de interação.  
- **BoardService** → Serviço que gerencia a lógica do tabuleiro (status, erros, reset).  
- **NotifierService** → Implementa o padrão **Observer**, permitindo notificar componentes da interface sobre eventos (ex.: limpar espaços).  
- **SudokuSector** → Painel que representa cada setor 3x3 do Sudoku.  
- **Botões customizados**:
  - `ResetButton`
  - `CheckGameStatusButton`
  - `FinishGameButton`

---

## ⚙️ Lógica Geral

1. O tabuleiro é construído dividindo-se em setores **3x3**, cada um preenchido com instâncias de `NumberText` (campos numéricos).  
2. O jogador preenche os campos com números de 1 a 9.  
3. A cada ação (reset, verificar status, finalizar), os serviços são acionados para validar ou atualizar o estado do jogo.  
4. Mensagens são exibidas para guiar o jogador sobre erros, conclusão ou progresso do jogo.  

---

## 📸 Interface

A interface é construída sobre `JFrame` e `JPanel`, utilizando **Swing** para criar uma experiência simples e intuitiva:  

- **Grid 9x9** representando o Sudoku.  
- **Botões de ação** abaixo do tabuleiro para interação com o jogo.  

---

## 🚀 Como Executar

1. Clone este repositório.  
2. Compile e execute o projeto em sua IDE Java favorita (IntelliJ, Eclipse, VS Code com extensão Java).
3. Argumentos para passar no running do projeto: <details> 0,0;4,false 1,0;7,false 2,0;9,true 3,0;5,false 4,0;8,true 5,0;6,true 6,0;2,true 7,0;3,false 8,0;1,false 0,1;1,false 1,1;3,true 2,1;5,false 3,1;4,false 4,1;7,true 5,1;2,false 6,1;8,false 7,1;9,true 8,1;6,true 0,2;2,false 1,2;6,true 2,2;8,false 3,2;9,false 4,2;1,true 5,2;3,false 6,2;7,false 7,2;4,false 8,2;5,true 0,3;5,true 1,3;1,false 2,3;3,true 3,3;7,false 4,3;6,false 5,3;4,false 6,3;9,false 7,3;8,true 8,3;2,false 0,4;8,false 1,4;9,true 2,4;7,false 3,4;1,true 4,4;2,true 5,4;5,true 6,4;3,false 7,4;6,true 8,4;4,false 0,5;6,false 1,5;4,true 2,5;2,false 3,5;3,false 4,5;9,false 5,5;8,false 6,5;1,true 7,5;5,false 8,5;7,true 0,6;7,true 1,6;5,false 2,6;4,false 3,6;2,false 4,6;3,true 5,6;9,false 6,6;6,false 7,6;1,true 8,6;8,false 0,7;9,true 1,7;8,true 2,7;1,false 3,7;6,false 4,7;4,true 5,7;7,false 6,7;5,false 7,7;2,true 8,7;3,false 0,8;3,false 1,8;2,false 2,8;6,true 3,8;8,true 4,8;5,true 5,8;1,false 6,8;4,true 7,8;7,false 8,8;9,false </details>
4. Rode a classe principal (`MainScreen`) para iniciar o jogo.  

---

## 🧩 Sobre o Sudoku

O objetivo do Sudoku é preencher o tabuleiro 9x9 com números de 1 a 9, obedecendo às regras:  
- Cada linha deve conter todos os números de 1 a 9 sem repetições.  
- Cada coluna deve conter todos os números de 1 a 9 sem repetições.  
- Cada setor 3x3 deve conter todos os números de 1 a 9 sem repetições.  

---

## 🎯 Conclusão

Este projeto demonstra:  
- Uso do **Swing** para interfaces gráficas em Java.  
- Organização de lógica de jogo em serviços (`BoardService`, `NotifierService`).  
- Aplicação de conceitos de **design patterns** como **Observer** e **MVC simplificado**.  

O resultado é um Sudoku totalmente funcional, modular e de fácil evolução.  
