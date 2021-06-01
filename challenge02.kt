fun main(){
    println(getFortuneCookies());
}

fun getFortuneCookies(): String{
    var birth = getBirthday();
//    var fortune: List<String> = listOf("You will have a great day!", "Things will go well for you today.", "Today is a good day for exercising restraint.");
    return when(birth){
        28 or 31-> "You will have a great day!"
        in (1..8)->"Things will go well for you today.";
        else-> "Today is a good day for exercising restraint.";
    }
}

fun getBirthday(): Int{
    var birth = readLine()?.toIntOrNull() ?: 1;
    return birth;
}
