object Darts {

    fun score(x: Number, y: Number): Int {
        // Since the center is (0,0), the distance formula is:
        // (x - 0)^2 + (y - 0)^2 = r^2
        // This simplifies to x^2 + y^2 = r^2
        // To check if a point is inside a circle, we use:
        // x^2 + y^2 <= r^2
        val xDouble = x.toDouble()
        val yDouble = y.toDouble()
        // We will use this one instead : SquareRoot(x^2 + y^2) <= r
        val squaredDistance = Math.sqrt(xDouble * xDouble + yDouble * yDouble)

        return when {
            // Here our r is a choice between { 1 , 5 , 10 }
            squaredDistance <= 1 -> 10
            squaredDistance <= 5 -> 5
            squaredDistance <= 10 -> 1
            else -> 0
        }
    }
}