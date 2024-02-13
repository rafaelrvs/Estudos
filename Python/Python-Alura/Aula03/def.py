import os

print("""
░██████╗░█████╗░██████╗░░█████╗░██████╗░  ███████╗██╗░░██╗██████╗░██████╗░███████╗░██████╗░██████╗
██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗  ██╔════╝╚██╗██╔╝██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝
╚█████╗░███████║██████╦╝██║░░██║██████╔╝  █████╗░░░╚███╔╝░██████╔╝██████╔╝█████╗░░╚█████╗░╚█████╗░
░╚═══██╗██╔══██║██╔══██╗██║░░██║██╔══██╗  ██╔══╝░░░██╔██╗░██╔═══╝░██╔══██╗██╔══╝░░░╚═══██╗░╚═══██╗
██████╔╝██║░░██║██████╦╝╚█████╔╝██║░░██║  ███████╗██╔╝╚██╗██║░░░░░██║░░██║███████╗██████╔╝██████╔╝
╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝  ╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═════╝░╚═════╝░  
""")
print("""

1. Cadastrar Restaurante
2. Listar Restaurante
3. Ativar restaurante
4. Sair
      
""")




# bloco de codigo que realiza uma ação

def cadastra_restaurante():
   
  print('Cadastrar Restaurante')

def lista_restaurante():
   print("Listar restaurante")

def ativa_restaurante():
   print("Ativar restaurante")


def finalizando_app():
   os.system('cls')
   print("Finalizando o App")

opcao_escolhida = int(input('Escolha uma opção: '))

if opcao_escolhida == 1 :
      cadastra_restaurante()
elif opcao_escolhida == 2:
      lista_restaurante()
elif opcao_escolhida == 3:
      ativa_restaurante()
else:
    finalizando_app()


