import React, { useEffect } from 'react';
import axios from "axios";

function App() {

  const [displayStr, setDisplayStr] = React.useState('');

  /**
   * Hello World表示
   */
  useEffect(() => {
    axios.get('http://localhost:8080/hello')
    .then(res => {
      setDisplayStr(res.data.displayStr)
    })
  }, []);
  
  return (
    <div>
      <h1>{displayStr}</h1>
    </div>
  );
}

export default App;
