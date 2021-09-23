import CardList from '../components/card-list/card-list.component';
import SearchBox from '../components/searchbox/searchbox.component';

const Container = ({robots, searchfield, onSearchChange}) =>{

const filteredRobots = robots.filter(robot =>{
  return robot.name.toLowerCase().includes(searchfield.toLowerCase());
})

return !robots.length ?
  <h1>Loading</h1> :
  (
    <div className='tc'>
      <h1 className='f1'>RoboFriends</h1>
      <SearchBox searchChange={onSearchChange}/>
        <CardList robots={filteredRobots} />
    </div>
  );

}

export default Container 