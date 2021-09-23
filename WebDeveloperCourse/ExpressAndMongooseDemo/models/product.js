const mongoose = require("mongoose");
const {Schema} = mongoose;
 
const producktSchema = new Schema({
        name: {
            type: String,
            required: true
        },
        price: {
            type: Number,
            required: true,
            min: 0
        },
        category:{
            type: String,
            lowercase:true,
            enum: ['fruit', 'vegetables','dairy']
        },
        farm : {
            type: Schema.Types.ObjectId,
            ref: 'Farm'
        }
    })


    const Product = mongoose.model('Product', producktSchema);

    module.exports = Product;