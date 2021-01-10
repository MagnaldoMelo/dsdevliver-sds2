import { useEffect } from "react"

type Props ={
    message: String
}

function Hello({message}:Props){
    useEffect(() => {
        console.log("Iniciando!")
    }, [])
    return(
        <h1>Componente Hello - {message}</h1>
    )
}

export default Hello