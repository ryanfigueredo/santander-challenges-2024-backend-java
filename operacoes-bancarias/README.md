## 1 / 5 - Operações Bancárias Simples com Switch
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

> Entrada
O programa exibirá um menu com as seguintes opções:

> Depositar<br />
> Sacar, Consultar Saldo, Encerrar.<br />
> O usuário escolherá uma dessas opções digitando o número correspondente.

> Saída
Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

> Se o usuário escolher:

1: O programa solicitará o valor a ser depositado e atualizará o saldo.<br />
2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente.<br />
3: O programa exibirá o saldo atual da conta.<br />
0: O programa encerrará.<br />

-----

## 2 / 5 - Verificação de Número de Conta Bancária

> Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

> Entrada
O programa solicitará ao usuário que digite o número da conta bancária.

> Saída
1. O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos. <br />
2. Se o número da conta tiver 8 dígitos, o programa informará que é um número válido. <br />
3. Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e  informará que o número da conta é inválido.

-----

## 3 / 5 - Verificador de Idade para Conta Bancária

> Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.

> Entrada
O programa solicitará ao usuário que digite sua idade.

> Saída
1. Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos. <br />
2. Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária. <br />
3. Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.

-----

## 4 / 5 - Verificação de Cheque Especial

> Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

> Entrada
O programa solicitará ao usuário que informe o saldo atual da conta bancária. <br />
Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.

> Saída
1. O programa deverá verificar se o saque ultrapassará o saldo disponível na conta. <br />
2. Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso. <br />
3. Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).<br />
• Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido. <br />
• Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.

## 5 / 5 - Controle de Saques

> Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

> Entrada
O programa solicitará ao usuário que informe o limite diário de saque. <br />
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

> Saída
1. Utilizando um laço for, o programa iterará sobre os saques. <br />
2. Para cada saque, o programa verificará se o valor ultrapassa o limite diário. <br />
• Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop. <br />
• Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
 
