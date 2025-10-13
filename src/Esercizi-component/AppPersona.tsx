import React from 'react'
import { useContext,createContext } from 'react'

const PersonaContext = createContext({matricola : 'A01', nome:'Nicola', eta: 65})

const AppPersona: React.FC = () => {

    const NewPersona = {matricola : 'A02', nome:'Michele', eta: 25}
  
  
    return (
    <PersonaContext.Provider value={NewPersona}>

        <Utente/>

    </PersonaContext.Provider>
  )
}

const Utente: React.FC = () => {
    return (
        <div>
            <DatiUtente/>
        </div>
    )
}

const DatiUtente: React.FC = () => {
    return (
        <div>
            <Dati/>
        </div>
    )
}

const Dati: React.FC = () => {
    const DatiApp = useContext(PersonaContext)
    return <>
    <h3>Matricola:{DatiApp.matricola}</h3><br></br>
    <h3>Nome:{DatiApp.nome}</h3>
    </>
}

export default AppPersona