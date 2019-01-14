//Write a groovy script to create List and implementing different methods like reverse (), sort (), 
//remove (index), findAll (closure), join (“string”), first (), last (), min () and max () etc.
// findAll (closure)

def list=["Ram","Shyam","Geeta","Mohan"]
println list.sort()

println list.reverse()

println list.remove(2)+" <- remove"

println list.first()+" <- first"

println list.last()+" <- last"

println list.min()+" <- min"

println list.max()+" <- max"

println list.join(" and ")+" <- join"// between 2 elements only

println list.findAll { it > "M"}

def newList=[1,2,3,4,5,6]
println newList.findAll{ it < 3 }