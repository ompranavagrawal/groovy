class P2 {
   static void main(String[] args) {
    int f=0;
    int s=1;
    int pos=3;
    int output=0;
    int i=0;
    for( i = 0 ;i < pos ; i++ ){
        if(pos <= 1){
            output=pos;
        }
        else{
            output=f+s;
            f=s;
            s=output;
        }
    }
    println "output =>"+output
   }
}