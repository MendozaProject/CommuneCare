package institute.curry.communecare.ui.taskboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import institute.curry.communecare.R

class TaskBoardFragment : Fragment() {

    companion object {
        fun newInstance() = TaskBoardFragment()
    }

    private lateinit var viewModel: TaskBoardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_task_board, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider.NewInstanceFactory().create(TaskBoardViewModel::class.java)
    }

}
