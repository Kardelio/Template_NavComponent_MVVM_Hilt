package bk.personal.com.templatemvvmnavigationhilt.sampleTwo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import bk.personal.com.templatemvvmnavigationhilt.R
import bk.personal.com.templatemvvmnavigationhilt.sample.view.SampleFragmentDirections
import kotlinx.android.synthetic.main.fragment_sample.view.*

class SampleTwoFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_sample_two, container, false)
        v.goButton.setOnClickListener {
            findNavController().navigate(SampleTwoFragmentDirections.actionSampleTwoFragmentToSampleFragment())
        }
        return v
    }
}