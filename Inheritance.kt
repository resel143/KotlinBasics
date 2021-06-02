package Acquarium

class Book(var title: String, var author: String){
    private var currentPage: Int = 1;
    open fun readPage(){
        currentPage++;
    }
}

class eBook(): Book(){
    private var wordsRead = 0;
    var format : String = "text";
    override fun readPage(){wordsRead += 250}

}
