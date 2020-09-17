package bk.personal.com.templatemvvmnavigationhilt.sample.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel @ViewModelInject constructor(val sampleString: String) : ViewModel(){
    val output : MutableLiveData<String> = MutableLiveData()
    init {
        output.postValue(sampleString)
    }
}