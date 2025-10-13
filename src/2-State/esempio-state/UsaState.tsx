import React, {useState} from "react";
import { IState1 } from "../model/IState1";
 
const UsaState = () => {
    const [web, setWeb] = useState<string>("")
    const [counter, setCounter] = useState<number>(10);

    const clickHandler = () => {
        setWeb ("Hola");
        setCounter(counter -1)
    }
    
    return (
        <div>
            <h3>{web}</h3>
            <h3>{counter}</h3>
            <button onClick={clickHandler}>
            Premi dai!
            </button>
        </div>
    )
}
export default UsaState
