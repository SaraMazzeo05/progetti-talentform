import React from "react";
 const TestProps: React.FC<{ surname: string; age: number; nation: string }> = (props) => {
    return (
        <div>
            <h3>{props.surname}</h3>
            <h3>{props.nation}</h3>
            <h3>{props.age}</h3>
        </div>
    );
 }
 export default TestProps;