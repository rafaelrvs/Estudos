import http from "http"; //biblioteca nativa do node.js

const PORT = 3000; 

const rotas = {
    "/": "Curso de node.js", 
    "/livros": "entrei na rota livros",
    "/autores": "entrei na rota autores"
}; // cada vez que mudar a rota, muda a resposta

//criando servidor para a conexão de dados 

const server = http.createServer((req,res) =>{
   res.writeHead (200, {"Content-Type": "text/plain"})// headers que possui as informações da requisição  
   res.end(rotas[req.url]); // passando uma variavel no objeto rotas usando [ req.url] 
   
   
});


server.listen(PORT, ()=>{
    console.log("Servidor escutando");
});
