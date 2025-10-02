💼 Projeto 4: Sistema de Planos de Assinatura com Diferentes Níveis

Um sistema orientado a objetos para gerenciar diferentes planos de assinatura, cada um com seus próprios benefícios, preços e regras de negócio. O projeto utiliza herança, polimorfismo e organização hierárquica de classes para simular a evolução de planos de um serviço.

📌 Objetivo

Implementar um sistema de planos de assinatura com três níveis — Básico, Premium e Enterprise — aplicando conceitos fundamentais de Programação Orientada a Objetos (POO):

✅ Herança

✅ Polimorfismo

✅ Especialização de atributos e métodos

✅ Regras de negócio específicas por plano

🧱 Estrutura de Classes
classDiagram
    class PlanoAssinatura {
        - nome: String
        - precoMensal: Float
        + calcularPrecoAnual(): Float
        + listarBeneficios(): void
        + upgradePlano(): PlanoAssinatura
    }

    class PlanoBasico {
        - limiteUsuarios: Int
        - armazenamento: String
    }

    class PlanoPremium {
        - suportePrioritario: Boolean
        - acessoOffline: Boolean
    }

    class PlanoEnterprise {
        - personalizacao: Boolean
        - suporte24h: Boolean
    }

    PlanoAssinatura <|-- PlanoBasico
    PlanoBasico <|-- PlanoPremium
    PlanoPremium <|-- PlanoEnterprise

💰 Regras de Negócio
Plano	Preço Base	Benefícios
Básico	R$ 50	✅ Acesso básico
Premium	R$ 100	✅ Acesso básico + ✅ Suporte prioritário
Enterprise	R$ 300	✅ Acesso total + ✅ Suporte 24h + ✅ Personalização de recursos
🧠 Atributos Sugeridos

PlanoAssinatura

nome

precoMensal

PlanoBasico

limiteUsuarios

armazenamento

PlanoPremium

suportePrioritario

acessoOffline

PlanoEnterprise

personalizacao

suporte24h

🧰 Métodos Sugeridos

calcularPrecoAnual(): retorna o custo total do plano no período de 12 meses.

listarBeneficios(): exibe os benefícios específicos de cada plano.

upgradePlano(): permite migrar para um plano superior.

📝 Exemplo de Uso (Pseudocódigo)
# Criando planos
basico = PlanoBasico("Plano Básico", 50)
premium = PlanoPremium("Plano Premium", 100)
enterprise = PlanoEnterprise("Plano Enterprise", 300)

# Listando benefícios
basico.listarBeneficios()
premium.listarBeneficios()
enterprise.listarBeneficios()

# Calculando preços
print(basico.calcularPrecoAnual())      # 600
print(premium.calcularPrecoAnual())     # 1200
print(enterprise.calcularPrecoAnual())  # 3600

# Upgrade de plano
novo_plano = basico.upgradePlano()  # Retorna um PlanoPremium

🧠 Conceitos Aplicados

Herança: cada plano herda atributos e métodos da classe superior.

Polimorfismo: os métodos calcularPrecoAnual e listarBeneficios são sobrescritos para cada plano.

Encapsulamento: atributos protegidos e métodos públicos para manipulação.

Extensibilidade: fácil adicionar novos tipos de planos futuramente.

🚀 Possíveis Extensões

✅ Adicionar descontos anuais ou cupons.

✅ Implementar downgrade de plano.

✅ Criar interface gráfica para gerenciamento.

✅ Integrar com sistema de pagamentos.

📂 Estrutura de Arquivos (Sugerida)
projeto-planos/
├── src/
│   ├── PlanoAssinatura.py
│   ├── PlanoBasico.py
│   ├── PlanoPremium.py
│   └── PlanoEnterprise.py
├── main.py
└── README.md
