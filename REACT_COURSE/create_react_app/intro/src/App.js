import {React, Component} from 'react'
import logo from './logo.svg';
import './App.css';

class App extends Component{
  constructor(){
    super();

    this.state={
      string: 'Hello World'
    }
  }




render(){
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>{this.state.string }</p>
        <button onClick={()=> this.setState({string: Math.floor(Math.random()*10)})}>Change text</button>
      </header>
    </div>
  );
}
}
export default App;
