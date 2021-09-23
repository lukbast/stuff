let quit = false;
let firstTime = true;
const TodoArray = [];
const actions = {
    new  : "adds a new Todo",
    list : "List All Todo",
    delete : "Remove specific item",
    commands : "show possible actions",
    quit : "Quit App"
}
while(!quit){
    
    
    

    

    if(firstTime===true){
    for(action of Object.entries(actions)){
        console.log(`${action[0]} - ${action[1]}`);
    }
    console.log("-----------------------------------")
    firstTime=false;
}

    let userImputCommand = prompt("Enter your choice").toLowerCase();

    switch(userImputCommand){
        case "new":
            TodoArray.push(prompt("Enter new Todo"));
            break;
        case "list":
            for (let i = 0; i < TodoArray.length; i++){
                console.log(`${i}: ${TodoArray[i]} `);
            }
            break;
        case "delete":
            let itemToDelete = prompt("Enter Todo that should be deleted. Be careful about name.");
            if(TodoArray.includes(itemToDelete) === true ){
                if(prompt("Enter 'yes' to confirm or anthing else to cancel").toLowerCase()==="yes"){
                    TodoArray.splice(TodoArray.indexOf(itemToDelete), 1);
                }
            } else {
                console.log(`Item ${itemToDelete} does not exist.`)
            }
            break;
        case "quit":
            console.log("Goodbye.")
            quit=true;
            break;
        case "commands":
            for(action of Object.entries(actions)){
                console.log(`${action[0]} - ${action[1]}`);
            }
            console.log("--------------------------------------------------")
            break;
    }
}