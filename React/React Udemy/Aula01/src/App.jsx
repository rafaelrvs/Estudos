import { Component, useState } from 'react'

import './App.css'

class App extends Component {
State ={
  name:'rafael',
  count:0
}



  handleclick =()=>{
const {count} = this.State;
this.setState({count: count+1})
    
  }

  render(){
  const {count} = this.State
  return <p onClick={this.handleclick}>{count}  </ p>
    
    

  

  }

 /* return (
    <>

        
    </>
  )*/
}

export default App
