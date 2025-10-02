💼 Projeto 4 — Sistema de Planos de Assinatura com Diferentes Níveis
📖 Introdução

Este projeto tem como objetivo desenvolver um sistema de planos de assinatura, simulando diferentes níveis de serviços oferecidos por uma empresa.
A solução foi construída aplicando conceitos fundamentais de Programação Orientada a Objetos (POO), como herança, polimorfismo e encapsulamento, garantindo uma estrutura flexível e fácil de expandir.

🎯 Objetivo do Projeto

O objetivo principal é criar uma hierarquia de classes para representar três níveis de planos de assinatura — Básico, Premium e Enterprise — cada um com preços e benefícios distintos, além de funcionalidades para:

Calcular preço anual

Listar benefícios de cada plano

Realizar upgrade entre planos

🧠 Conceitos Utilizados

🧱 Herança — Estrutura hierárquica para reaproveitar atributos e métodos.

🔁 Polimorfismo — Métodos sobrescritos (listarBeneficios() e calcularPrecoAnual()) com comportamentos diferentes em cada classe.

🔐 Encapsulamento — Organização clara dos atributos e métodos de cada classe.

🌱 Extensibilidade — Facilidade para adicionar novos tipos de planos no futuro.

🧱 Hierarquia de Classes

PlanoAssinatura → Classe base

PlanoBasico → Herda de PlanoAssinatura

PlanoPremium → Herda de PlanoBasico

PlanoEnterprise → Herda de PlanoPremium

Cada classe adiciona atributos e comportamentos específicos, representando os níveis de serviço oferecidos.

💰 Regras de Negócio
Plano	Preço Mensal	Benefícios
Básico	R$ 50	✅ Acesso básico
Premium	R$ 100	✅ Acesso básico + ✅ Suporte prioritário
Enterprise	R$ 300	✅ Acesso total +
