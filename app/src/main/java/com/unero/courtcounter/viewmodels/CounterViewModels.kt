package com.unero.courtcounter.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.unero.courtcounter.models.Score

class CounterViewModels: ViewModel() {
    private var scoreMutableLiveData: MutableLiveData<Score> = MutableLiveData<Score>()
    private var score = Score()
    val scoreLiveData: LiveData<Score>
        get() = scoreMutableLiveData

    fun add(team: Char, point: Int){
        if (team == 'a'){
            score.awayScore += point
            scoreMutableLiveData.value = score
        } else {
            score.homeScore += point
            scoreMutableLiveData.value = score
        }
    }

    fun reset(){
        score.awayScore = 0
        score.homeScore = 0
        scoreMutableLiveData.value = score
    }
}