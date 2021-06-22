package bk.personal.com.templatemvvmnavigationhilt.sampleTwo.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import bk.personal.com.templatemvvmnavigationhilt.databinding.FragmentSampleTwoBinding

class SampleTwoFragment : Fragment() {

    private lateinit var bind: FragmentSampleTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentSampleTwoBinding.inflate(inflater, container, false)
        val view = bind.root
        bind.goButton.setOnClickListener {
            findNavController().navigate(SampleTwoFragmentDirections.actionSampleTwoFragmentToSampleFragment())
        }

        bind.mybutton.setOnClickListener {
            Log.d("BK","Button click")
            bind.mytextview.text = bind.myedittext.text
        }
        return view
    }
}