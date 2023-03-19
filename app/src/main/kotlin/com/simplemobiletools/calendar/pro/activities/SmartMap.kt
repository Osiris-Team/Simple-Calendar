package com.simplemobiletools.calendar.pro.activities

class MyPair<K, V>{
    public var key: K
    public var value: V
    constructor(key: K, value: V) {
        this.key = key
        this.value = value
    }
}

class SmartMap<K, V> {

    // INIT
    public val pairs = mutableListOf<MyPair<K, V>>()
    public fun put(k: K, v: V){
        for (pair in pairs) {
            if(pair.key == k){
                pair.value = v
                return
            }
        }
        pairs.add(MyPair(k, v))
    }

    // GET
    public fun getByKey(k: K): MyPair<K, V>? {
        for (pair in pairs) {
            if(pair.key == k){
                return pair
            }
        }
        return null
    }
    public fun getByValue(v: V): MyPair<K, V>? {
        for (pair in pairs) {
            if(pair.value == v){
                return pair
            }
        }
        return null
    }

    // REMOVE
    public fun removeByKey(k: K) {
        var foundPair: MyPair<K, V>? = null
        for (pair in pairs) {
            if(pair.key == k){
                foundPair = pair
                break
            }
        }
        if(foundPair!=null)
            pairs.remove(foundPair)
    }
    public fun removeByValue(v: V) {
        var foundPair: MyPair<K, V>? = null
        for (pair in pairs) {
            if(pair.value == v){
                foundPair = pair
                break
            }
        }
        if(foundPair!=null)
            pairs.remove(foundPair)
    }
}
