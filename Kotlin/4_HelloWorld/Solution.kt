object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0)
        var count : Int = 0
        var mynumber = start
        while (mynumber > 1){
            when {
                mynumber % 2 == 0 -> mynumber = mynumber / 2
                else -> mynumber = mynumber * 3 + 1
            }
            count++
        }
        return count
    }
}