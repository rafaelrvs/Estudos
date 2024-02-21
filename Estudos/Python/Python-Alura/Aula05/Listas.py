import os


restaurantes = []



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

def retorna_menu():
    input('Digite uma tecla para retornar ao menu principal: ')
    main()

def exibir_subtitulo(texto):
   os.system('cls')
   print(texto)

   

def finalizando_app():
   exibir_subtitulo('Finalizando aplicação! ')



def opcao_invalida():
      exibir_subtitulo('Opção invalida! ') 
      retorna_menu()

      
def cadastrar_novo_restaurante():
      exibir_subtitulo('Cadastramento de restaurantes:  ')
      nome_do_restaurante = input('Digite o nome do restaurante que deseja cadastrar:\n')
      restaurantes.append(nome_do_restaurante)#aqui é adicionado o nome na lista 
      print(f'O restaurante {nome_do_restaurante} foi cadastrado com sucesso!')
      retorna_menu()
      

def listar_restaurante():
    exibir_subtitulo('Lista de Restaurantes: ')
    #para cada restaurante na lista Restaurante: exiba o nome 
    for restaurante in restaurantes: # procurando e retonando valores de uma lista 
         print(f'.{restaurante}')
    retorna_menu()
    
def escolher_opcao():
      try:
            opcao_escolhida = int(input('Escolha uma opção: '))

            if opcao_escolhida == 1 :
                  cadastrar_novo_restaurante()
            elif opcao_escolhida == 2:
                  listar_restaurante()
            elif opcao_escolhida == 3:
                  print("Ativar restaurante")   
            elif opcao_escolhida == 4: # adicionando para evitar erros
                  finalizando_app()
            else:
                  opcao_invalida()
      except:
            opcao_invalida()

def main():
     os.system('cls')
     exibir_nome_do_programa()
     exibir_opcoes()
     escolher_opcao()
    
#definindo arquivo principal , não sera importado por outros script
if __name__ == '__main__':
      main()