import  express, { raw }  from "express";


const app = express(); // importando a biblioteca e executando a função express para dentro da variavel app



function buscaLivro(id){// buscando livro verificando o id 
    return livros.findIndex( livros =>{ //verificando se dentro da array existe o id 
        return livros.id === Number(id);// se for igual, retorne 
    })
}



app.use(express.json())
const livros = 
[
    {
    id: 1,
    autor:"chico"
    },
    {
        id: 2,
        autor:"japo"
    }
    




];

app.get("/", (req,res) =>{
    res.status(200).send("curso de node.js");
});// passando  a responsabilidade para o express de gerenciar as rotas, ouvindo as  rotas sendo chamadas


app.get("/livros", (req,res)=>{
    res.status(200).json(livros);
});


app.get("/livros/:id",(req, res)=>{
    const index = buscaLivro(req.params.id)
    res.status(200).json(livros[index]);
    
});

app.post("/livros", (req,res)=>{
    livros.push(req.body);// passando body para alteração
    res.status(201).send("Livro cadastrado com sucesso");
});

app.put("/livros/:id", (req, res)=>{
    const index = buscaLivro(req.params.id)// passando parametros para busca do livro
    livros[index].autor = req.body.autor; //pegando uma propriedade e passando como parametro
    res.status(200).json(livros)
})


app.delete("/livros/:id", (req, res)=>{
    const index = buscaLivro(req.params.id); // buscando livro
    livros.splice(index, 1)// removendo um elemento da lista
    res.status(200).send("Elemento excluido")//resposta
})

export default app;