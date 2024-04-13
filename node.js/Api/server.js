// import http from "http";  biblioteca nativa do node.js  não mais necessario por conta do express 
import app from "./src/app.js";
const PORT = 3000; 
/*
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
responsabilidade do servidor passada para o express, dessa forma não precisa criar o servidor 
*/


app.listen(PORT, ()=>{ // usando o app.js para escutar o servidor 
    console.log("Servidor escutando");
});
