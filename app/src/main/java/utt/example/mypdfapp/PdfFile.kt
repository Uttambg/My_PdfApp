package utt.example.mypdfapp

data class PdfFile(val fileName : String , val downloadUrl : String){
    constructor() : this("","")
}
