fun canAddFish(tankSize:Double, currFish:List<Int>, fishSize: Int = 2, hasDecorations:Boolean = true): Boolean{
    var totalLength = 0;
    for(i in currFish){
        totalLength += i;
    }
    if(hasDecorations){
        var capacity = (4*tankSize)/5;
        if((capacity-totalLength)>=fishSize){
            return true;
        }else return false;
    }
    else{
        if((tankSize-totalLength)>=fishSize) return true;
        else return false;
    }
}

fun main(){
    println("Hello and welcome to Water world!");
    print(canAddFish(10.0, listOf(3,3,3)));
    print(canAddFish(8.0, listOf(2,2,2), hasDecorations = false));
    print(canAddFish(9.0, listOf(1,1,3), 3))
    print(canAddFish(10.0, listOf(), 7, true))

}
