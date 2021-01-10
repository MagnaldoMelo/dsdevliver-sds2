import { useState } from "react"

function Counter(){
    const [counter, setCounter] = useState(0)

    const handleIncrementar = () => {
        setCounter(counter + 1)
    }

    const handleDecrementar = () => {
        setCounter(counter - 1)
    }

    return(
        <div>
            <button onClick={handleIncrementar}>Incrementar</button>
            <button onClick={handleDecrementar}>Decrementar</button>
            <h1>Valor do Contador: {counter}</h1>
        </div>
    )
}

export default Counter