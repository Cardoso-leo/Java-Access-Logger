# Java Access Logger

Sistema de registro de acesso desenvolvido em Java.

Este projeto registra:
- Usuário do sistema
- Pasta acessada
- Data e hora do acesso

As informações são salvas automaticamente em um arquivo `acessos.log`.

---

## 🚀 Como funciona

O programa captura:
- O nome do usuário do sistema (`System.getProperty("user.name")`)
- A data e hora atual
- A pasta configurada no código

Em seguida, grava essas informações no arquivo `acessos.log`.

