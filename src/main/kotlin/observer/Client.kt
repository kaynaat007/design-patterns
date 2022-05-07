package observer

/**
 *  client code testing observer pattern
 */
fun main(){

    val cricketScore = CricketScore()
    val  rahul = Rahul(cricketScore)
    val  nikhil  = Nikhil(cricketScore)

    cricketScore.registerObserver(rahul)
    cricketScore.registerObserver(nikhil)
    cricketScore.setNewScore()

    cricketScore.deregister(rahul)

    cricketScore.setNewScore()

}