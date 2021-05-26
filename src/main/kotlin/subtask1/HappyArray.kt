package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.size>2) {
            var happyArray = convertToHappy2(sadArray)
            if(happyArray.size!=2) {
                var happyArray2 = convertToHappy2(happyArray)
                while (happyArray.size != happyArray2.size) {
                    happyArray = convertToHappy2(happyArray)
                    happyArray2 = convertToHappy2(happyArray)
                }

                return happyArray


                throw NotImplementedError("Not implemented")
            }   else return happyArray
        }   else return sadArray
    }

    fun convertToHappy2(sadArray: IntArray): IntArray {


        var happyArray = IntArray(sadArray.size) {0}
        happyArray[0]=sadArray[0]
        var j = 1
        var i = 1
        do {
            if (sadArray[j]<sadArray[j-1]+sadArray[j+1]){
                happyArray[i] = sadArray[j]
                i++}
            j++
        }while (j<sadArray.size-1)
        happyArray[i]=sadArray[sadArray.lastIndex]

        var newHappyArray = IntArray(i+1)
        var c = 0
        newHappyArray.forEach { el ->
            newHappyArray[c] = happyArray[c]
            c++}
        return newHappyArray




    }

}
