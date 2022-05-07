package observer

class Rahul constructor(subject: Subject): Observer {

    var sub = subject
    var score: Int = 0

    override fun update() {
        score = sub.getScore()
        println("rahul get score of :  $score")
    }

    override fun getName(): String {
         return "rahul"
    }
}