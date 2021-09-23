import React from 'react'
import Container from '../containers/app.containter.jsx'
import robots from '../assets/robots.js'
import './styles.css'


class App extends React.Component {
  constructor() {
    super()
    this.state = {
      robots: robots,
      searchfield: ''
    }
  }

  onSearchChange = (event) => {
    this.setState({ searchfield: event.target.value })
  }

  render() {
    const { robots, searchfield } = this.state;
      return(
      <Container robots={robots} searchfield={searchfield} onSearchChange={this.onSearchChange}/>
      )
  }
}

export default App;