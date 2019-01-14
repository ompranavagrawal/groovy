Integer[] Arr=[1,2,3,4,5]

println "each returns every element"
Arr.each{     //each
println it
}


println "any condition checks if any element satisfies the condition"
//return boolean
println Arr.any{       //any
it>3
}


println "every condition check whether every element satisfies the given condition"
//return boolean
println Arr.every{       //every
it>0
}