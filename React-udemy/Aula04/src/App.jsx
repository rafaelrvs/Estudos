import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Component } from 'react'


  // informação que não utiliza mais por causa do hook{

    // Componentes sem estados -> pode ser funções ou classes
    // Componentes com estados -> deve ser classes
  //}

class App extends  Component{ //não tem estado
  // o estado mostra como o react deve atualizar 

  // Toda vez que o estado mudar ele renderiza automaticamente
constructor(props){
  super(props)
  this.state ={
    name:'felipe',
    idade:"25"
  }
}

  render(){
    const name = this.state.name
    const idade = this.state.idade
    return(
      <div>
        <p>{name}</p>
        <p>{idade}</p>

      </div>
    )

  }
}

export default App
