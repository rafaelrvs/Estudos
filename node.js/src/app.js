import  express  from "express";


const app = express(); // importando a biblioteca e executando a função express para dentro da variavel app
app.get("/", (req,res) =>{
    res.status(200).send("curso de node.js");
});// passando  a responsabilidade para o express de gerenciar as rotas, ouvindo as  rotas sendo chamadas

export default app;