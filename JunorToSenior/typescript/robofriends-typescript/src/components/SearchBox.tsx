import React from 'react';

interface IsearchChange {
  searchChange(event: React.SyntheticEvent<HTMLInputElement>):void
}

const SearchBox = ({ searchChange}: IsearchChange) => {
  return (
    <div className='pa2'>
      <input
        className='pa3 ba b--green bg-lightest-blue'
        type='search'
        placeholder='search robots'
        onChange={searchChange}
      />
    </div>
  );
}

export default SearchBox;