
getDadJokes = async () =>{
    
    try{
        const header = { headers: { Accept: 'application/json'} };
    
        let res = fetch("https://icanhazdadjoke.com/", header);
        const data = (await res).json();
        return data;
        } catch(e){
            console.log("Error");
            console.log(e);
        }
    }

    getDadJokes()
    .then(data => {
        console.log(data.jocke)
    })
    .catch(e =>{
        console.log("LLOLOLOLOL");
        console.log(e);
    })



getBitcoinRate = async () => {
    try{
    let res = await fetch('https://api.cryptonator.com/api/full/btc-usd')
    const data = await res.json();
    let price = data.ticker.price;
    console.log(price);
    } catch (e){
        console.log("ERROR");
        console.log(e);
    }
}


const randomShit = async () =>{
    if (Math.round(Math.random()*10)>5){
        setTimeout(() => {
            console.log("GUT GUD")
            let shit = "Something happen";
            return shit ;
        }, 1);
    } else throw ("Holy shit!")
} 

randomShit()
    .then(data =>{
        console.log('promise resolved', data);
    })
    .catch(err => {
        console.log('Oh no, rejected');
        console.log(err);
    });


    const login = async (username, password) =>{
        if(username== "pipi" && password=="pipi"){
            return "Login Successful"
        } else throw('Password wrong')
    }

    
    login("pipi", "pipi")
        .then(data =>{
            console.log("Welcome", data);
            return "nextStep"
        })
        .then(data2 =>{
            console.log("Various Shit Displayed", data2)
        })
        .catch(e =>{
            console.log("something went wrong", e)
        });

        


            

       
        
            

        
