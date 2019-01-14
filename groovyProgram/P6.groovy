// Write a groovy script to print each character in a given string.
String str="Pranav Agrawal"

//str.each{ println it}

//for(i in str) println i

//for(i in 0..<str.length())
//    println str[i]

for(i in 0..<str.length())
    println str.getAt(i)