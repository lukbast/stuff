import React from 'react';

interface IscrollProps{
  children: JSX.Element
}


const Scroll = (props: IscrollProps) => {
  return (
    <div style={{ overflow: 'scroll', border: '5px solid black', height: '800px'}}>
      {props.children}
    </div>
  );
};

export default Scroll;