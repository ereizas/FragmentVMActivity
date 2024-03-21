package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val numRolled = MutableLiveData<Int>()

    fun setNumRolled(_numRolled:Int)
    {
        numRolled.value=_numRolled
    }

    fun getNumRolled(): LiveData<Int>
    {
        return numRolled
    }
}