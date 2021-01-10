import "./Hello"
import Hello from "./Hello"
import Counter from "./Counter"

function App() {
  return (
    <div className="App">
      <h1>Funcionando!</h1>
      <Hello message="Magnaldo"/>
      <Counter/>
    </div>
  );
}

export default App;
