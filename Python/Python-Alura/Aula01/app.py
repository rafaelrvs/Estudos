
print("""
░██████╗░█████╗░██████╗░░█████╗░██████╗░  ███████╗██╗░░██╗██████╗░██████╗░███████╗░██████╗░██████╗
██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗  ██╔════╝╚██╗██╔╝██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝
╚█████╗░███████║██████╦╝██║░░██║██████╔╝  █████╗░░░╚███╔╝░██████╔╝██████╔╝█████╗░░╚█████╗░╚█████╗░
░╚═══██╗██╔══██║██╔══██╗██║░░██║██╔══██╗  ██╔══╝░░░██╔██╗░██╔═══╝░██╔══██╗██╔══╝░░░╚═══██╗░╚═══██╗
██████╔╝██║░░██║██████╦╝╚█████╔╝██║░░██║  ███████╗██╔╝╚██╗██║░░░░░██║░░██║███████╗██████╔╝██████╔╝
╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝  ╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═════╝░╚═════╝░  
""")
print('Sabor express \n')



print('1. Cadastrar Restaurante' )
print('2. Listar Restaurante' )
print('3. Ativar restaurante' )
print('4. Sair\n')
#snake_case

print("1. Cadastrar Restaurante", "2. Listar Restaurante ","3. Ativar restaurante","4. Sair", sep='\n')
#sep='\n' toda vez que ocorrer a separação, uma linha é pulada 
print("""

1. Cadastrar Restaurante
2. Listar Restaurante
3. Ativar restaurante
4. Sair
      
""")

# o mesmo resultado uando 3 aspas """ content """

opcao_escolhida = input('Escolha uma opção: ')

print(f'Você escolheu {opcao_escolhida}' )



