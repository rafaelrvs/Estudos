import http from "http"; //biblioteca nativa do node.js
const PORT = 3000; 

const rotas = {
    "/": "Curso de node.js"
}
//criando servidor para a conexão de dados 

const server = http.createServer((req,res) =>{
   res.writeHead (200, {"Content-Type": "text/plain"})// headers que possui as informações da requisição  
   res.end("Curso de node.js")
});


server.listen(PORT, ()=>{
    console.log("Servidor escutando");
})
