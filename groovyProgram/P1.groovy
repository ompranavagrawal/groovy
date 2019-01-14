int num= 1234
int sum=0;
while(num/10>0){
    sum=sum + num.mod(10)
    num=num / 10
}
println sum