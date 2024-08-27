//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}

/*
val equipment = "fish net" to "catching fish"
 println("${equipment.first} used for ${equipment.second}")
fish net used for catching fish

val numbers = Triple(6, 9, 42)
 println(numbers.toString())
 println(numbers.toList())
(6, 9, 42)[6, 9, 42]

val equipment2 = ("fish net" to "catching fish") to "equipment"
 println("${equipment2.first} is ${equipment2.second}\n")
 println("${equipment2.first.second}")
(fish net, catching fish) is equipment
catching fish

val equipment = "fish net" to "catching fish"
 val (tool, use) = equipment
 println("$tool is used for $use")
fish net is used for catching fish

val numbers = Triple(6, 9, 42)
 val (n1, n2, n3) = numbers
 println("$n1 $n2 $n3")
6 9 42

val list = listOf(1, 5, 3, 4)
 println(list.sum())
13

al list2 = listOf("a", "bbb", "cc")
 println(list2.sum())
error: expecting an element
al list2 = listOf("a", "bbb", "cc")
         ^
error: expecting ')'
al list2 = listOf("a", "bbb", "cc")
                     ^
error: expecting an element
al list2 = listOf("a", "bbb", "cc")
                     ^
error: expecting an element
al list2 = listOf("a", "bbb", "cc")
                            ^
error: expecting an element
al list2 = listOf("a", "bbb", "cc")
                                  ^

val list2 = listOf("a", "bbb", "cc")
 println(list2.sumBy { it.length })
6

val list2 = listOf("a", "bbb", "cc")
 for (s in list2.listIterator()) {
     println("$s ")
 }
a bbb cc

val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

println(cures.get("white spots"))
Ich

println(cures["red sores"])
hole disease

println(cures["scale loss"])
null

println(cures.getOrDefault("bloating", "sorry, I don't know"))
sorry, I don't know

println(cures.getOrElse("bloating") {"No cure for this"})
No cure for this

al inventory = mutableMapOf("fish net" to 1)
 inventory.put("tank scrubber", 3)
 println(inventory.toString())
 inventory.remove("fish net")
 println(inventory.toString())
incomplete code

val inventory = mutableMapOf("fish net" to 1)
 inventory.put("tank scrubber", 3)
 println(inventory.toString())
 inventory.remove("fish net")
 println(inventory.toString())
{fish net=1, tank scrubber=3}{tank scrubber=3}

 */