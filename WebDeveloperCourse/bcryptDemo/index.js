const bcrypt = require('bcrypt');



const hashPassword = async (pw) => {
    const salt = await bcrypt.genSalt(12);

    let hash = await bcrypt.hash(pw , salt);
    console.log(hash);
    return hash;
}






const login = async (pw, hashedPassword ) => {
    const result = await bcrypt.compare(pw, hashedPassword);
    if(result) {
        console.log('LOGGED IN')
    } else {
        console.log("go eff yourself");
    }
}

login('mankey', '$2b$12$wAA6dbbYuilni1lk6Uy.reqmPuUtNBn8rQaKN9w13Qy5BLM/R5YrK' );
console.log("------------------------------")

const hp = async (pw) => {
    const hash = await bcrypt.hash(pw, 12);
    console.log(hash);
}


login('mankey', '$2b$12$wW2pC.sgRCZV2hhXz.Cn1egaDdaV1ohYf7Yy24bZ4UteGhv8F1pse')