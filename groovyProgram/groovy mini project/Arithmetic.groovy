class Arithmetic{
    def static plus(int a,int b){
        int c= a+b
        println c
        assert c==3
    }
    def static minus(int a,int b){
        println a-b
        assert (a.minus(b))==(a-b)
    }
    def static multiply(int a,int b){
        println a*b
        assert (a.multiply(b))==(a*b)
    }
    def static div(int a,int b){
        println a/b
        assert (a.div(b))==(a/b)
    }
    def static mod(int a,int b){
        println a%b
        assert (a.mod(b))==(a%b)
    }
    def static previous(int a){
        println a--
        assert (a.previous())==(--a) 
    }
    def static next(int a){
        println a++
        assert (a.next())==(++a) 
    }
    def static power(int a,int b){
        println a**b
        assert (a.power(b))==(a**b)
    }
    static void main(String[] args){
        plus(1,2)
        minus(2,1)
        multiply(3,3)
        div(9,3)
        mod(2,2)
        previous(2)
        next(1)
        power(3,3)
    }

}

