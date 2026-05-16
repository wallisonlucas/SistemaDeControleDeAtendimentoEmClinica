# 🏥 Controle de Atendimento em Clínica — Padrão de Projeto Mediator

> Atividade prática da disciplina de **Padrões de Projeto** do curso de **Análise e Desenvolvimento de Sistemas (ADS) - IFPB**, aplicando o padrão **Mediator** para centralizar a comunicação entre os diferentes setores de uma clínica, evitando dependências diretas excessivas.

---

## 📌 Sobre o projeto

Este projeto simula um sistema de atendimento clínico onde múltiplos setores recepção, médico, enfermagem, laboratório e paciente precisam se comunicar de forma coordenada. Utilizando o **padrão Mediator**, nenhum setor se comunica diretamente com outro; toda interação passa pela `CentralAtendimentoClinica`, que funciona como ponto único de coordenação do fluxo.

---

## 🎯 Objetivo

Aplicar o padrão **Mediator** para:

- Centralizar a comunicação entre os setores da clínica em um único objeto mediador
- Eliminar dependências diretas entre os participantes
- Facilitar a alteração do fluxo de atendimento sem impactar os participantes individuais

---

## 🧠 O Padrão Mediator

O **Mediator** é um padrão comportamental que define um objeto que encapsula a forma como um conjunto de objetos interage. Ele promove o baixo acoplamento ao evitar que os objetos se refiram uns aos outros explicitamente.

---

## 🗂️ Estrutura do Projeto

```
SistemaDeControleDeAtendimentoEmClinica/
  └── src/
        ├── CentralAtendimentoClinica → mediador concreto (coordena toda a comunicação)
        ├── Enfermagem                → participante concreto
        ├── Laboratorio               → participante concreto
        ├── Main
        ├── MediadorClinica           → interface (contrato base do mediador)
        ├── Medico                    → participante concreto
        ├── Paciente                  → participante concreto
        ├── Participante              → classe base dos participantes
        └── Recepcao                  → participante concreto
```

---

## 💡 Responsabilidades das Classes

| Classe | Papel no Mediator | Descrição |
|---|---|---|
| `MediadorClinica` | **Interface** | Contrato base do mediador |
| `CentralAtendimentoClinica` | **Concrete Mediator** | Centraliza e coordena toda a comunicação entre os setores |
| `Participante` | **Classe base** | Define a estrutura comum de todos os participantes |
| `Recepcao` | **Colleague** | Inicia e finaliza o atendimento via mediador |
| `Medico` | **Colleague** | Solicita ações aos demais setores via mediador |
| `Enfermagem` | **Colleague** | Responde às solicitações do médico via mediador |
| `Laboratorio` | **Colleague** | Processa exames e informa resultados via mediador |
| `Paciente` | **Colleague** | Recebe comunicações dos setores via mediador |

---

## 👨‍💻 Autor

Desenvolvido como atividade prática da disciplina de **Padrões de Projeto** - ADS IFPB.
