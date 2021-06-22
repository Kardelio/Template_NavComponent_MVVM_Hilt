package bk.personal.com.templatemvvmnavigationhilt.sample.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import bk.personal.com.templatemvvmnavigationhilt.R
import bk.personal.com.templatemvvmnavigationhilt.sample.viewmodel.SampleViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_sample.view.*

@AndroidEntryPoint
class
SampleFragment : Fragment(){

    //DEP: fragment-ktx (requires compileOptions 1.8 and same for kotlin options)
    //We can use hilt to inject viewmodels now this works with the below ktx fun
    private val viewModel: SampleViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_sample, container, false)
        v.testt.setContent {
            testte()
        }
        v.goButton.setOnClickListener {
           findNavController().navigate(SampleFragmentDirections.actionSampleFragmentToSampleFragmentTwo())
        }
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.output.observe(viewLifecycleOwner, Observer {
            Log.d("BK","String: $it")
        })
    }
}

@Preview
@Composable
fun testte(){
    Text(text = "Tets")
}