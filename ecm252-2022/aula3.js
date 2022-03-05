function filter(v,f){
    let result = []
    let j = 0
    for (let i = 0 ; i<v.length; i++){
        if (f(v[i])){
            result[j]=v[i]
            j++
        }

    }
    return result
}

//[2]
console.log(filter([1,2,3], e => e % 2 === 0))

function map (v,f){
    let result = []
    let j = 0
    for(let i = 0 ; i<v.length;i++){
        result[j]=f(v[i])
        j++
    }
    return result
}
console.log(map(['abcd','abc'], e=> e.length))