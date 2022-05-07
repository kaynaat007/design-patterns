package observer

interface Subject {

    fun notifyObserver()
    fun registerObserver(observer: Observer)
    fun deregister(observer: Observer)
    fun getScore(): Int
}