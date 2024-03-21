package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val numRolled = MutableLiveData<String>()

    fun setNumRolled(_numRolled:String)
    {
        numRolled.value=_numRolled
    }

    fun getNumRolled(): LiveData<String>
    {
        return numRolled
    }
}