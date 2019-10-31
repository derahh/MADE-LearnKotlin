package com.derahh.myflexiblefragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_detail_category.*

/**
 * A simple [Fragment] subclass.
 */
class DetailCategoryFragment : Fragment(), View.OnClickListener {

    var description: String? = null

    companion object {
        var EXTRA_NAME = "extra_name"
        var EXTRA_DESCRIPTION = "extra_description"
    }

    private lateinit var tvCategoryName: TextView
    private lateinit var tvCategoryDescription: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvCategoryName = view.findViewById(R.id.tv_category_name)
        tvCategoryDescription = view.findViewById(R.id.tv_category_description)

        btn_profile.setOnClickListener(this)
        btn_show_dialog.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_profile -> {

            }

            R.id.btn_category -> {

            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (savedInstanceState != null){
            val desFromBundle = savedInstanceState.getString(EXTRA_DESCRIPTION)
            description = desFromBundle
        }

        if (arguments != null){
            val categoryName = arguments?.getString(EXTRA_NAME)
            tvCategoryName.text = categoryName
            tvCategoryDescription.text = description
        }
    }
}
