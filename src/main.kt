/**
 * @author CodeTober
 */

const val STUDENT_NAME = "Waldo"
const val MAX_SCORE = 100

fun main(args: Array<String>) {
    // Conditionals Tutorial

    // Define variables to use during the following examples
    val examScore = 95
    val skippedExam = true

    // IF statements
    if(examScore == 100){
        println("Amazing! Perfect Grade!")
    }

    if(examScore == MAX_SCORE){
        println("Congratulations! You managed a perfect score!")
    }

    if(examScore != MAX_SCORE){
        println("Nope. You failed. Try again.")
    }


    // IF/ELSE statements
    if(examScore == MAX_SCORE){
        println("100% Awesome Job!")
    } else {
        println("Better luck next time...")
    }


    // IF/ELSE Conditional Operators and Logical operators
    if(examScore == MAX_SCORE || skippedExam){
        println("I can't believe it! You've done it again!")
    } else if(examScore > 90 && examScore < MAX_SCORE){
        println("You managed an \"A\" grade.")
    } else if(examScore > 80 && !skippedExam){
        println("You managed a \"B\" grade.")
    } else if(examScore >= 70){
        println("You managed a \"C\" grade.")
    } else {
        println("Try again.")
    }

    // IF/ELSE without curly braces
    if(examScore == MAX_SCORE)
        println("What will you do next?!")
    else if(examScore < MAX_SCORE)
        println("This was 'all or nothing'.")
        println("Please try again")


    // Using a Range
    val outputText = when(examScore) {
        100 -> "Perfect! A+"
        in 90..99 -> "Pretty good! A"
        in 80..99 -> "Nice. B"
        else -> "Try again"
    }

    println(outputText)

    // Alternatively, we could write the same logic using if + else/if statements

//    val outputText = if(examScore == 100){
//        "Perfect! A+"
//    } else if(examScore in 90..99){
//        "Pretty good! A"
//    } else if(examScore in 80..89){
//        "Nice. B"
//    } else {
//        "Try again"
//    }
}