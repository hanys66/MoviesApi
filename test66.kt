fun main() {
    val name: String = "BG"
    var age: Int = 25
    val names = arrayOf("barry","robin","morice","andy")
    val numbers= arrayOf(1,2,3,4)
names[2]="HANY"
    println("BEE ur $name and ur age is $age")
    if (age >= 40) {
        println("TRUE")
    } else {
        println("FALSE")

    }
    println(names[2])
    println(numbers[2])
    for(i in numbers){
        println(i)
    }

}
//"postinstall": "pnpx playwright-core install chromium",
