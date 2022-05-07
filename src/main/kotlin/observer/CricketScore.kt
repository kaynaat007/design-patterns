package observer

import kotlin.random.Random

/**
 * subject maintains a state which is accessible by getters.
 * Whenever state change happens, observers are notified and they call these getters to get the latest value.
 */

class CricketScore: Subject {

    val observers = mutableListOf<Observer>()
    var subjectScore: Int = 0

    fun setNewScore(){
        subjectScore = Random(0).nextInt()
        notifyObserver()
    }

    override fun getScore(): Int {
        return subjectScore
    }

    override fun notifyObserver() {
        for (observer in observers) {
            observer.update()
        }
    }

    override fun registerObserver(observer: Observer) {
        println("registering observer..${observer.getName()}")
        observers.add(observer)
    }

    override fun deregister(observer: Observer) {
        println("removing observer..${observer.getName()}")
        observers.remove(observer)
    }
}