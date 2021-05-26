package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        if ((bill.sum()-bill[k])/2-b==0){return "Bon Appetit"}
        else   {
            val output = b-(bill.sum()-bill[k])/2
            return ("$output")}
    }
}
