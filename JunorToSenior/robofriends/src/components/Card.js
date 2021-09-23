import React from 'react'

class Card extends React.Component {
    render() {
        const {name, email, id} = this.props
        return(
            <div className='bg-light-green dib br3 pa3 ma2 grow bw2 shadow'>
                <img alt='work in progress' src={`https://robohash.org/${id * 20}?size=200x200`}/>
                <div>
                    <h2>{name}</h2>
                    <p>{email}</p>
                </div>
            </div>
        )
    }
}

export default Card;