val COMMENT_FINDER = "(/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/|[ \\t]*//.*)".toRegex()
val DUPLICATED_LINE_BREAK = "\n\t\n"
val VOID_REPLACER: String = ""

execute(args.get(0))

fun execute(fileName: String) {
    val cleanSourceCode = readFileDirectlyAsText(fileName)
        .cleanCode()

    writeTextInFile(cleanSourceCode, fileName)

    println("successfull erasing")
}

fun readFileDirectlyAsText(fileName: String): String =
    java.io.File(fileName).readText(Charsets.UTF_8)

fun String.cleanCode(): String =
    removeComments()
        .removeDuplicatedBlankLines()

fun String.removeComments(): String =
    replace(COMMENT_FINDER, VOID_REPLACER)

fun String.removeDuplicatedBlankLines(): String =
    replace(DUPLICATED_LINE_BREAK, "\n")

fun writeTextInFile(text: String, fileName: String) {
    java.io.File(fileName).writeText("")
    java.io.File(fileName).writeText(text)
}
