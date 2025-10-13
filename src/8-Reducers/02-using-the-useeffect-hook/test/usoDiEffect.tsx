import React, {useState, useEffect, use} from 'react'


const usoDiEffect = () => {
    const [count , setCount] = useState<number>(0);
    useEffect(()=> {
        setTimeout(()=> {
            setCount((count)=> count -1)
        }, 10)
    })
  return (
    <div>usoDiEffect{count}</div>
  )
}
export default usoDiEffect