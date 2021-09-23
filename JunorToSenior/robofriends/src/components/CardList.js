import React from 'react'
import Card from './Card'

class CardList extends React.Component {
    render() {
        const robots = this.props.robots
        const cardsArr = this.props.robots.map((user, i ) => {
            return <Card key={i} id={robots[i].id} name={robots[i].name} email={robots[i].email}/>
        })
        return(
            
         <>{cardsArr}</>
        )
    }}


export default CardList