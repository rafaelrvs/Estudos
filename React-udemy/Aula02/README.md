Nessa div carrega todo o react dentro do elemento root

---------------------------------------------------------------
ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode> 
    <App /> ->Aqui pode alterar o documento raiz
  </React.StrictMode>,
)
----------------------------------------------------------------
