# meu-projeto-testes
# Comparação de Geração de Testes: SBST vs. LLMs

Este repositório contém uma atividade prática de Engenharia de Software focada na comparação entre duas abordagens de geração automática de testes unitários: **Search-Based Software Testing (SBST)** e **Large Language Models (LLM)**.

## 🎯 Objetivo
O objetivo principal é avaliar a eficácia, a cobertura de código (*branch coverage*) e a capacidade de detecção de falhas (análise de mutantes) de testes gerados por ferramentas automáticas.

## 🛠️ Ferramentas Utilizadas
- **Linguagem:** Java
- **SBST (Parte A):** EvoSuite (Algoritmos Evolutivos)
- **LLM (Parte B):** ChatGPT-4o (Geração Assistida por IA)
- **Métricas:** PITest (Mutation Testing) e JUnit para execução.

## 📂 Estrutura do Repositório
- `PasswordValidator.java`: Classe principal contendo a lógica de validação de senhas (alvo dos testes).
- `/evosuite`: Contém a suíte de testes gerada automaticamente pelo EvoSuite. Foca em maximizar a cobertura através de busca estocástica.
- `/llm`: Contém a suíte de testes gerada via prompt para IA Generativa. Foca em casos de uso reais e legibilidade.

## 📊 Resumo dos Resultados

| Abordagem | Cobertura (Branch) | Mutation Score | Legibilidade |
| :--- | :---: | :---: | :--- |
| **EvoSuite** | 100% | 96% | Baixa |
| **LLM (IA)** | 91% | 82% | Alta |

## 📝 Conclusão
Enquanto o **EvoSuite** se mostrou mais eficiente em "matar" mutantes e garantir que nenhum caminho lógico ficasse sem teste, a **IA (LLM)** produziu um código muito mais fácil de manter e entender, cobrindo os principais cenários de negócio de forma semântica.

---
Projetado para fins acadêmicos.
