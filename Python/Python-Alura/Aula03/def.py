import os
def exibir_nome_do_programa():
      print("""
░██████╗░█████╗░██████╗░░█████╗░██████╗░  ███████╗██╗░░██╗██████╗░██████╗░███████╗░██████╗░██████╗
██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗  ██╔════╝╚██╗██╔╝██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝
╚█████╗░███████║██████╦╝██║░░██║██████╔╝  █████╗░░░╚███╔╝░██████╔╝██████╔╝█████╗░░╚█████╗░╚█████╗░
░╚═══██╗██╔══██║██╔══██╗██║░░██║██╔══██╗  ██╔══╝░░░██╔██╗░██╔═══╝░██╔══██╗██╔══╝░░░╚═══██╗░╚═══██╗
██████╔╝██║░░██║██████╦╝╚█████╔╝██║░░██║  ███████╗██╔╝╚██╗██║░░░░░██║░░██║███████╗██████╔╝██████╔╝
╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝  ╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═════╝░╚═════╝░  
""")
      

def exibir_opcoes():      
      print("""

1. Cadastrar Restaurante
2. Listar Restaurante
3. Ativar restaurante
4. Sair
      
""")




# bloco de codigo que realiza uma ação


def finalizando_app():
   os.system('cls')
   print("Finalizando o App")

def escolher_opcao():
      opcao_escolhida = int(input('Escolha uma opção: '))

      if opcao_escolhida == 1 :
             print('Cadastrar Restaurante')
      elif opcao_escolhida == 2:
            print("Listar restaurante")
      elif opcao_escolhida == 3:
            print("Ativar restaurante")   
      else:
            finalizando_app()

def main():
     exibir_nome_do_programa()
     exibir_opcoes()
     escolher_opcao()
    
#definindo arquivo principal , não sera importado por outros script
if __name__ == '__main__':
      main()