import React from 'react'
import { ITalentform } from '../../1-Introduction/model/ITalentform'
const Figlio3: React.FC <ITalentform> = (props) => {
  return (
    <div>
         <h3>{props.product}</h3>
         <h3>{props.brand}</h3>
         <h3>{props.price}</h3>
         <h3>{props.color}</h3>
    </div>
        
  )
}
export default Figlio3;