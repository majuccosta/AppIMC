# App Classificador de IMC — Android 

Aplicativo Android desenvolvido na disciplina de **Programação para Dispositivos Móveis (PDM)** 

---

## Descrição

O app permite calcular e classificar o **Índice de Massa Corporal (IMC)** de uma pessoa a partir do peso e da altura informados. Ao clicar no botão, o resultado é exibido na tela com o valor do IMC e sua classificação.

---

## Funcionalidades

- Entrada do peso (kg) e altura (m) pelo usuário
- Cálculo automático do IMC com a fórmula:

```
IMC = peso / (altura × altura)
```

- Classificação do resultado conforme a tabela abaixo:

| IMC | Classificação |
|-----|--------------|
| Abaixo de 18,5 | Abaixo do peso |
| 18,5 a 24,9 | Peso normal |
| 25,0 a 29,9 | Sobrepeso |
| Acima de 30,0 | Obeso |

---

## Estrutura do projeto

```
app/
├── src/
│   └── main/
│       ├── java/com/example/appimc/
│       │   └── MainActivity.java   # Lógica principal e eventos
│       └── res/
│           └── layout/
│               └── activity_main.xml  # Layout da tela
```

---
## Como executar

1. Clone este repositório
2. Abra o projeto no **Android Studio**
3. Conecte um dispositivo físico ou inicie um emulador
4. Clique em **Run** (`Shift + F10`)
